package au.com.childcare.controller;

import au.com.childcare.dataobject.Teacher;
import au.com.childcare.dao.TeacherDAOImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import javax.enterprise.inject.Model;
import org.springframework.ui.Model;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
@RequestMapping (value = "/insertteacher")
public class InsertTeacherController {

    private TeacherDAOImplementation teacherDAOImplementation;

    public InsertTeacherController(TeacherDAOImplementation teacherDAOImplementation) {

        this.teacherDAOImplementation = teacherDAOImplementation;
    }

    @RequestMapping (method = GET)
    public String beforeInsert(Model model){

        return "insertingTeacher";
    }

    @RequestMapping (method = POST)
    public String afterInsert(Teacher teacherFormData, Model model){

        int id = teacherFormData.getId();
        String name = teacherFormData.getName();

        teacherDAOImplementation.insertRecord(teacherFormData);

        model.addAttribute("teacherInForm" , teacherFormData);

        return "insertedTeacher";

    }
}




