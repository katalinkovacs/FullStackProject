package au.com.childcare.controller;

import au.com.childcare.dataobject.Teacher;
import au.com.childcare.dao.TeacherDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/findteacher")
public class FindTeacherController {

    private TeacherDAOImplementation teacherDAOImplementation;

    @Autowired  // CONSTRUCTOR
    public FindTeacherController(TeacherDAOImplementation teacherDAOImplementation) {

        this.teacherDAOImplementation = teacherDAOImplementation;
    }

    @RequestMapping(method = GET)
    public String findTeacher(Model model){

        return "teacherToBeFound";
    }

    @RequestMapping(method = POST)
    public String foundTeacher(Teacher formData, Model model){

        int teacherId = formData.getId();
        Teacher teacherObject = teacherDAOImplementation.findTeacherById(teacherId);
        model.addAttribute("teacher" , teacherObject);
        System.out.println("foundTeacher METHOD-----------------------------------------------------");

        return "foundTeacherDetails";
    }

}
