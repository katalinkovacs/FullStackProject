package childcare;

import model.TeacherDAOImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StartApp03 {


    public static void main(String[] args) {

        System.out.println("ApplicationContext context  --> CREATING----------------------------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        System.out.println("ApplicationContext context  --> CREATED----------------------------------");

        TeacherDAOImp teacherDAOImp = (TeacherDAOImp) context.getBean("teacherDaoImp");

        //System.out.println("------CREATING table TEACHER--------" );
        //teacherDAOImp.createTeacherTable();
        ///System.out.println("------TEACHER table CREATED--------" );

        //teacherDAOImp.insertRecord(4, "Connie");

        //Teacher teacher1 = new Teacher(7, "Ruby");
        //teacherDAOImp.insertRecordVersion2(teacher1);

        Teacher t = teacherDAOImp.findTeacherById(4);
        System.out.println("ID IS: " +t.getId() +". NAME IS: " +t.getName());

        List<Teacher> teacherList = teacherDAOImp.listEveryTeacher();

 /*       for (Teacher record : teacherList) {
            System.out.println("ID : " + record.getId() +", Name : " + record.getName() );

        }

*/
        teacherDAOImp.updateRecordWithArgs(7);

        //teacherDAOImp.deleteRecord();
        List<Teacher> teacherList2 = teacherDAOImp.listEveryTeacher();

        //teacherDAOImp.deleteRecordById(1);



        //System.out.println(teacherDAOImp.findTeacherById(4));
        //System.out.println(teacherDAOImp.findTeacherById(4).getName());

        //System.out.println(teacherDAOImp.findTeacherByIdAndName(5, "Simone"));
        //System.out.println("ID IS: " + teacherDAOImp.findTeacherByIdAndName(5, "Simone").getId());
        //System.out.println("NAME IS: " + teacherDAOImp.findTeacherByIdAndName(5, "Simone").getName());






        //System.out.println(t.getName());// NOT WORKING
        ///teacherDAOImp.listEveryTeacher();


        //System.out.println("------DELETING table TEACHER--------" );
        //teacherDAOImp.deleteTeacherTable();

/*
        ChildDAOImpl childDAOImpl = (ChildDAOImpl)context.getBean("childDaoImpl");

        System.out.println("------INSERTING Records into CHILD--------" );
        childDAOImpl.insertRecord(35, "Zara Taylor", 11);
        //childDAOImpl.insertRecord(31, "Moby", 2);
        //childDAOImpl.insertRecord(32, "Sade", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<Child> childrenList = childDAOImpl.listAllChildren();

        for (Child record : childrenList) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        childDAOImpl.updateRecord(2);

        System.out.println("----Listing Record with ID = 2 -----" );
        Child child = childDAOImpl.findChildById(2);
        System.out.print("ID : " + child.getId() );
        System.out.print(", Name : " + child.getName() );
        System.out.println(", Age : " + child.getAge());
*/

    }



}
