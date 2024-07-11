package cimet2.test.microserviced.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-d")
public class ServiceDController {

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Service D Endpoint";
    }
}
