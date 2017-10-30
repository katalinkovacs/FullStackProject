/*
package controller;

import childcare.Child;
import model.ChildDAO;
import model.ChildDAOImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/display")
public class DisplayDataController {


    @RequestMapping(method = GET)
    public String login(Model model) {


        ArrayList<Child> childrenList = ChildDAO.listAllChildren();
        model.addAttribute("kiddos", childrenList);   //name of attribute + value pair
        return "display";
    }



}
        */

