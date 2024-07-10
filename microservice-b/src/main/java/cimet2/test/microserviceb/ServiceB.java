package cimet2.test.microserviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service-b")
public class ServiceB {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Service B Endpoint";
    }

    @GetMapping("/call-d")
    public String callServiceD() {
        return restTemplate.getForObject("http://localhost:8083/service-d/endpoint", String.class);
    }
}
