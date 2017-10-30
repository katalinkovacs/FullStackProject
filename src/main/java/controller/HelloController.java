package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping( method = GET )
    public String hi() {

        return "hello";
    }



}
