package cimet2.test.microserviceb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceB {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callServiceD() {
        return restTemplate.getForObject("/service-d/endpoint", String.class);
    }
}
