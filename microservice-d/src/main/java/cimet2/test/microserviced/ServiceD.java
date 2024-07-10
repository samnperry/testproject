package cimet2.test.microserviced;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-d")
public class ServiceD {

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Service D Endpoint";
    }
}
