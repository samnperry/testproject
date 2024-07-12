package cimet2.test.microservicea.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class ServiceA {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callServiceB() {
        return restTemplate.getForObject("/service-b/endpoint", String.class);
    }

    @CircuitBreaker(name = "serviceA", fallbackMethod = "fallbackForService")
    @RateLimiter(name = "serviceA", fallbackMethod = "fallbackForService")
    @Retry(name = "serviceA", fallbackMethod = "fallbackForService")
    @Bulkhead(name = "serviceA", fallbackMethod = "fallbackForService")
    public String callServiceC() {
        return restTemplate.getForObject("/service-c/endpoint", String.class);
    }

    public String fallbackForCallServiceC(Exception e) {
        return "Fallback response for Service C due to " + e.getMessage();
    }
}
