package cimet2.test.microservicea.controller;

import cimet2.test.microservicea.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    private final ServiceA serviceA;

    @Autowired
    public ServiceAController(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @RequestMapping(value = "/call-b", method = RequestMethod.GET)
    public String callServiceB() {
        return serviceA.callServiceB();
    }

    @RequestMapping(value = "/call-c", method = RequestMethod.GET)
    public String callServiceC() {
        return serviceA.callServiceC();
    }
}
