package cimet2.test.microserviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cimet2.test.microserviceb.service.ServiceB;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {

    private final ServiceB serviceB;

    public ServiceBController(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Service B Endpoint";
    }

    @GetMapping("/call-d")
    public String callServiceD() {
        return serviceB.callServiceD();
    }
}
