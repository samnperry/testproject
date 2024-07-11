package cimet2.test.microserviced.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceD {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callServiceB() {
        return restTemplate.getForObject("/service-b/call-d", String.class);
    }
}
