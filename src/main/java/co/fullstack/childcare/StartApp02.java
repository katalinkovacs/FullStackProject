package co.fullstack.childcare;

import co.fullstack.model.TeacherDAOImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StartApp02 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        TeacherDAOImplementation teacherDAOImp = (TeacherDAOImplementation) context.getBean("teacherDaoImp");

        //Teacher teacherToInsert = new Teacher(9, "Philippa");    --> WORKING OK
        //teacherDAOImp.insertRecord(teacherToInsert);             --> WORKING OK

        Teacher teacherToBeFound = teacherDAOImp.findTeacherById(4);
        System.out.println("ID IS: " + teacherToBeFound.getId() + ". NAME IS: " + teacherToBeFound.getName());

        System.out.println("---------------------------------------------------");

        List<Teacher> teacherList = teacherDAOImp.listEveryTeacher();

        //teacherDAOImp.updateRecordWithArgs(7);                    --> WORKING OK

        //teacherDAOImp.deleteRecord();                             --> WORKING OK
        //teacherDAOImp.deleteRecordById(1);                        --> WORKING OK
        //teacherDAOImp.listEveryTeacher();                         --> WORKING OK

        //System.out.println(teacherDAOImp.findTeacherByIdAndName(5, "Simone"));
        //System.out.println("ID IS: " + teacherDAOImp.findTeacherByIdAndName(5, "Simone").getId());
        //System.out.println("NAME IS: " + teacherDAOImp.findTeacherByIdAndName(5, "Simone").getName());

    }


}
