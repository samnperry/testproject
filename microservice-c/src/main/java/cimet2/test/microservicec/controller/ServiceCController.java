package cimet2.test.microservicec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-c")
public class ServiceCController {

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Service C Endpoint";
    }
}
