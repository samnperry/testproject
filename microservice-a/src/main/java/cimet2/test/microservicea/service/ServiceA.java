package cimet2.test.microservicea.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceA {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callServiceB() {
        return restTemplate.getForObject("/service-b/endpoint", String.class);
    }

    public String callServiceC() {
        return restTemplate.getForObject("/service-c/endpoint", String.class);
    }
}
