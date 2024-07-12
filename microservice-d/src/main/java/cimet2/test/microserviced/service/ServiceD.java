package cimet2.test.microserviced.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ServiceD {

    private final RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = "serviceD", fallbackMethod = "fallbackForService")
    public String callServiceB() {
        return restTemplate.getForObject("/service-b/call-d", String.class);
    }

    public String fallbackForCallServiceB(Exception e) {
        return "Fallback response for Service B due to " + e.getMessage();
    }
}
