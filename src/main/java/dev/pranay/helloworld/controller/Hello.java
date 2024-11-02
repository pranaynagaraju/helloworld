package dev.pranay.helloworld.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
    @ResponseBody
    @GetMapping("/hello")
    public String sayHelloWorld()
    {
        return "Hello World";
    }
}
