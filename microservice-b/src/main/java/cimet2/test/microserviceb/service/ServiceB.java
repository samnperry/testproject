package cimet2.test.microserviceb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceB {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callServiceD() {
        return restTemplate.getForObject("http://localhost:8083/service-d/endpoint", String.class);
    }
}
