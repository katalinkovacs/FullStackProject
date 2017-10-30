package model;

import childcare.Teacher;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class TeacherDAOImplementation implements TeacherDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;


    public void setDataSource(DataSource dataSource) {
        //System.out.println("SetDataSource is invoked!---------------------");
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

/*    //NOT A GOOD PRACTISE!!!!
    public  void insertRecordBad(int id, String name){
        //System.out.println("Inserting records into the TEACHER table...");
        String sql = "INSERT INTO Teacher (id, Name) VALUES (" + id + ",     \"" + name + "\" "    + ")";
        jdbcTemplateObject.update(sql);
        System.out.println("Created Record ID is = " +id +" Name is: " + name);
        return;
    }
*/
    public void insertRecord(Teacher teacher){

        String sql = "INSERT INTO Teacher (id, Name) VALUES (" + teacher.getId() + ",     \"" + teacher.getName() + "\" "    + ")";
        jdbcTemplateObject.update(sql);
        System.out.println("Created Record ID is = " +teacher.getId() +" Name is: " + teacher.getName());
        return;

    }

    public Teacher findTeacherById(int id){
        // SQL --> select id, name from katidb.teacher where id = 4;
        String sql = "SELECT id, name FROM Teacher WHERE id = ? ";   // ? --> ARGS
        System.out.println("-----------------------");
        Teacher teacher = (Teacher) jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new TeacherMapper());
        return teacher;

    }

    public Teacher findTeacherByIdAndName(int id, String name){

        String sql = "SELECT id, name FROM Teacher WHERE id = ? AND name = ?";
        System.out.println("-----------------------");
        Teacher teacher = (Teacher) jdbcTemplateObject.queryForObject(sql, new Object[]{id, name}, new TeacherMapper());
        return teacher;

    }

    public List<Teacher> listEveryTeacher() {

        String SQL = "SELECT * from Teacher";
        List <Teacher> teacherList = jdbcTemplateObject.query(SQL, new TeacherMapper());

        System.out.println("Looping through TeacherList:");
        for (Teacher currentTeacher : teacherList) {
            System.out.println("ID : " + currentTeacher.getId() +", Name : " + currentTeacher.getName() );

        }

        return teacherList;
    }

    public void deleteRecord(){

        String SQL = "DELETE FROM Teacher WHERE ID = 2";
        jdbcTemplateObject.update(SQL);
        return;

    }

    public void deleteRecordById(int id){

        String SQL = "DELETE FROM Teacher WHERE ID = " +id +"";
        jdbcTemplateObject.update(SQL);
        return;
    }



    public  void updateRecord(){

        String sql = "UPDATE Teacher SET Name = 'JillyBilly' WHERE Id = 7";
        jdbcTemplateObject.update(sql);
        return;

    }

    public  void updateRecordWithArgs(int id){

        String sql = "UPDATE Teacher SET Name = 'Jill' WHERE Id = " +id +"";
        jdbcTemplateObject.update(sql);
        return;

    }




}
