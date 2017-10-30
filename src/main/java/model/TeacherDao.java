package model;

import childcare.Teacher;

import javax.sql.DataSource;
import java.util.List;


public interface TeacherDao {

    public void setDataSource(DataSource ds);          //????????????????????????????????????

    public void createTeacherTable();  // NOT USED

    public void deleteTeacherTable();  // NOT USED

    public void insertRecord(int id, String name);  //NOT A GOOD PRACTISE

    public void insertRecordVersion2(Teacher teacher);

    public Teacher findTeacherById(int id);

    public Teacher findTeacherByIdAndName(int id, String name);

    public List<Teacher> listEveryTeacher();

    public void deleteRecord();

    public void deleteRecordById(int id);

    public void updateRecord();

    public void updateRecordWithArgs(int id);


}