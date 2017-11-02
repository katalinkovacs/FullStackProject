package com.fullstack.controller;

import com.fullstack.childcare.Child;
import com.fullstack.model.ChildDAOImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/insertchild")
public class InsertChildController {

    private ChildDAOImplementation childDAOImplementation;

    public InsertChildController(ChildDAOImplementation childDAOImplementation) {

        this.childDAOImplementation = childDAOImplementation;
    }

    @RequestMapping(method = GET)
    public String beforeInsert(Model model){

        return "insertingChild";
    }

    @RequestMapping(method = POST)
    public String afterInsert(Child formData, Model model){

        int id = formData.getId();
        String name = formData.getFullName();
        int age = formData.getAgeMonth();

        childDAOImplementation.insertRecord(formData);

        model.addAttribute("child" , formData);

        return "insertedChildToDb";
    }
}
