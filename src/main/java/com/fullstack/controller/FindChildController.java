package com.fullstack.controller;

import com.fullstack.childcare.Child;
import com.fullstack.model.ChildDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/findchild")
public class FindChildController {

    private ChildDAOImplementation childDAOImplementation;

    @Autowired
    public FindChildController(ChildDAOImplementation childDAOImplementation) {

        this.childDAOImplementation = childDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String findChild(Model model) {

        return "childToBeFoundByName";
    }

    @RequestMapping( method = POST )
    public String foundChild(Child formData, Model model) {

        String name = formData.getFullName();
        Child childObject = childDAOImplementation.findChildByName(name);
        model.addAttribute("child" , childObject);

        return "foundChildDetails";
    }



}
