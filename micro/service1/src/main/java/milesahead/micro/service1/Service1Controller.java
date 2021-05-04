package milesahead.micro.service1;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/service1")
    public Service1 service1(@RequestParam(value = "name", defaultValue = "Service1") String name) {
        return new Service1(counter.incrementAndGet(), String.format(template, name));
    }
}
