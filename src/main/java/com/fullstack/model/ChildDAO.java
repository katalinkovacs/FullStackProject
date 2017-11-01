package com.fullstack.model;

import com.fullstack.childcare.Child;
//import javax.sql.DataSource;
import java.util.List;

public interface ChildDAO {

    //public void setDataSource(DataSource ds);

    // METHOD to INSERT a record in the Child table.
    public void insertRecord(int id, String name, int age);

    // METHOD to LIST a record from the Child table by id.
    public Child findChildById(int id);

    // METHOD to LIST all records from the Child table.
    public List<Child> listAllChildren();

    // METHOD to DELETE a record from the Child table.
    public void deleteRecord(int id);

    // METHOD to UPDATE a record in the Child table.
    public void updateRecord(int id);

}
