package model;

import childcare.Child;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ChildMapper implements RowMapper{

    public Child mapRow(ResultSet rs, int rowNum) throws SQLException {

        Child child = new Child();
        child.setId(rs.getInt("id"));
        child.setName(rs.getString("name"));
        child.setAge(rs.getInt("age"));

        return child;
    }


}
