package au.com.childcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/")
public class WelcomePageController {

    @RequestMapping( method = GET )
    public String welcome() {

        return "welcomepage";
    }



}
