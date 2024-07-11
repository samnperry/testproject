package cimet2.test.microserviceb.controller;

import cimet2.test.microserviceb.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {

    private final ServiceB serviceB;

    @Autowired
    public ServiceBController(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @RequestMapping(path = "/endpoint", method = RequestMethod.GET)
    public String endpoint() {
        return "Service B Endpoint";
    }

    @RequestMapping(path = "/call-d", method = RequestMethod.GET)
    public String callServiceD() {
        return serviceB.callServiceD();
    }
}
