package cimet2.test.microservicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cimet2.test.microservicea.service.ServiceA;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    private final ServiceA serviceA;

    public ServiceAController(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @GetMapping("/call-b")
    public String callServiceB() {
        return serviceA.callServiceB();
    }

    @GetMapping("/call-c")
    public String callServiceC() {
        return serviceA.callServiceC();
    }
}
