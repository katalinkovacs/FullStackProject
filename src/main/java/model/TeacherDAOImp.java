package model;

import childcare.Teacher;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class TeacherDAOImp implements TeacherDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;


    public void setDataSource(DataSource dataSource) {       //???????????????????????????????????

        System.out.println("SetDataSource is invoked!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void createTeacherTable() {

        String SQL = "CREATE TABLE Teacher (id int, name varchar(255))";

        jdbcTemplateObject.update(SQL);
        return;

    }

    public void deleteTeacherTable() {

        String SQL = "Drop table Teacher";
        jdbcTemplateObject.update(SQL);
        return;

    }

    public  void insertRecord(int id, String name){

        System.out.println("Inserting records into the TEACHER table...");

        //String sql = "INSERT INTO Child (id, Name, Age) VALUES (" + c.getId() + ", \"" + c.getName() + "\"," + c.getAge() + ")";
        String sql = "INSERT INTO Teacher (id, Name) VALUES (" + id + ",     \"" + name + "\" "    + ")";
        //String sql = "INSERT INTO Child (id, Name, Age) VALUES (" + id + ", \"" + name + "\"," + age + ")";

        //stmt.executeUpdate(sql);

        System.out.println("Inserted records into the table...");

        jdbcTemplateObject.update(sql);
        System.out.println("Created Record ID is = " +id +" Name is: " + name);
        return;

    }

    public void insertRecordVersion2(Teacher teacher){

        String sql = "INSERT INTO Teacher (id, Name) VALUES (" + teacher.getId() + ",     \"" + teacher.getName() + "\" "    + ")";

        jdbcTemplateObject.update(sql);

        System.out.println("Created Record ID is = " +teacher.getId() +" Name is: " + teacher.getName());
        return;

    }

    public Teacher findTeacherById(int id){

        // SQL --> select id, name from katidb.teacher where id = 4;

        String sql = "SELECT id, name FROM Teacher WHERE id = ? ";
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

        String SQL = "select * from Teacher";
        List <Teacher> teacherList = jdbcTemplateObject.query(SQL, new TeacherMapper());

        for (Teacher record : teacherList) {
            System.out.println("ID : " + record.getId() +", Name : " + record.getName() );

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
