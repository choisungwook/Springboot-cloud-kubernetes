package demo.springbootvalues.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${message1:message1}")
    private String message1;

    @Value("${message2:message2}")
    private String message2;

    @GetMapping("/")
    public String getMessages() {
        return message1 + " " + message2;
    }
}
