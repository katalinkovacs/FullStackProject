package au.com.childcare.controller;

import au.com.childcare.dataobject.Teacher;
import au.com.childcare.dao.TeacherDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/teacherslistdisplay")
public class TeachersListController {


    private TeacherDAOImplementation teacherDAOImplementation;

    @Autowired
    public TeachersListController(TeacherDAOImplementation teacherDAOImplementation) {

        this.teacherDAOImplementation = teacherDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String hi(Model model) {

        List<Teacher> teachers =  teacherDAOImplementation.listEveryTeacher();

        model.addAttribute("teachers", teachers);
        return "teachersListDisplay";
    }



}
