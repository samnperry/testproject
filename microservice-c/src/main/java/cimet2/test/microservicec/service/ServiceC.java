package cimet2.test.microservicec.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceC {

    private final RestTemplate restTemplate = new RestTemplate();

    public String callServiceA() {
        return restTemplate.getForObject("/service-a/call-c", String.class);
    }
}
