package cimet2.test.microservicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service-a")
public class ServiceA {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/call-b")
    public String callServiceB() {
        return restTemplate.getForObject("http://localhost:8081/service-b/endpoint", String.class);
    }

    @GetMapping("/call-c")
    public String callServiceC() {
        return restTemplate.getForObject("http://localhost:8082/service-c/endpoint", String.class);
    }
}
