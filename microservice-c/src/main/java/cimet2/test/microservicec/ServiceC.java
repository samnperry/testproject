package cimet2.test.microservicec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-c")
public class ServiceC {

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Service C Endpoint";
    }
}
