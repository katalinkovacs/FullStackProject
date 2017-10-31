package com.fullstack.controller;

import com.fullstack.childcare.Teacher;
import com.fullstack.model.TeacherDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/teachersdisplay")
public class TeachersController {


    private TeacherDAOImplementation teacherDAOImplementation;

    @Autowired
    public TeachersController(TeacherDAOImplementation teacherDAOImplementation) {

        this.teacherDAOImplementation = teacherDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String hi(Model model) {

        List<Teacher> teachers =  teacherDAOImplementation.listEveryTeacher();

        model.addAttribute("teachers", teachers);
        return "teachersListDisplay";
    }



}
