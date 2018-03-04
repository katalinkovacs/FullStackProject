package au.com.childcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {


    //private TeacherDAOImplementation teacherDAOImplementation;

    //@Autowired
    //public HelloController(TeacherDAOImplementation teacherDAOImplementation) {
   //     this.teacherDAOImplementation = teacherDAOImplementation;
    //}

    @RequestMapping( method = GET )
    public String hi() {

        //teacherDAOImplementation.listEveryTeacher();

        return "hello";
    }



}
