package com.fullstack.model;

import com.fullstack.childcare.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//import javax.sql.DataSource;
import java.util.List;

@Repository
public class ChildDAOImplementation implements ChildDAO{

        private JdbcOperations jdbcOperations;

        @Autowired
        public ChildDAOImplementation(JdbcOperations jdbcOperations) {  // ChildDAOImplementation must have JdbcOperations!!!

            this.jdbcOperations = jdbcOperations;
        }


/*      // THIS WAS USED WITH JdbcTemplate!!!!!
        private DataSource dataSource;
        private JdbcTemplate jdbcTemplateObject;

        public void setDataSource(DataSource dataSource) {
            //System.out.println("SetDataSource is invoked------------");
            this.dataSource = dataSource;
            this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        }
*/

        public void insertRecord(int id, String name, int age) {

            String SQL = "insert into Child (id, name, age) values (id, name, age)";
            //jdbcTemplateObject.update(SQL);
            jdbcOperations.update(SQL);
            System.out.println("Created Record ID is = " +id +" Name is: " + name + " Age = " + age);
            return;
        }

        public Child findChildById(int id) {

            String SQL = "select * from Child where id = 1";
            //Child child = (Child) jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new ChildMapper());
            Child child = (Child) jdbcOperations.queryForObject(SQL, new Object[]{id}, new ChildMapper());

            return child;

        }

        public List<Child> listAllChildren() {

            String SQL = "select * from Child";
            //List <Child> children = jdbcTemplateObject.query(SQL, new ChildMapper());
            List <Child> children = jdbcOperations.query(SQL, new ChildMapper());
            return children;
        }

        public void deleteRecord(int id) {

            String SQL = "delete from Child where id = 2";
            //jdbcTemplateObject.update(SQL);
            jdbcOperations.update(SQL);

            System.out.println("Deleted Record with ID = " + id );
            return;

        }

        public void updateRecord(int id){

            String SQL = "update Child set age = 11 where id = 16";
            //jdbcTemplateObject.update(SQL);
            jdbcOperations.update(SQL);
            System.out.println("Updated Record with ID = " + id );
            return;
        }

    }
