package au.com.childcare.dao;

import au.com.childcare.dataobject.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
//import javax.sql.DataSource;
import java.util.List;

@Repository
public class ChildDAOImplementation implements ChildDAO{
        // ChildDAOImplementation must have JdbcOperations!!!
        private JdbcOperations jdbcOperations;

        @Autowired
        public ChildDAOImplementation(JdbcOperations jdbcOperations) {

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

/*        public void insertRecord(int id, String fullName, int ageMonth) {

            String SQL = "insert into Child (id, fullName, ageMonth) values (id, fullName, ageMonth)";
            //jdbcTemplateObject.update(SQL);
            jdbcOperations.update(SQL);
            System.out.println("Created Record ID is = " +id +" Name is: " + fullName + " Age = " + ageMonth);
            return;
        }
*/

        public void insertRecord(Child child) {

            //String sql = "INSERT INTO Child (id, Name, Age) VALUES (" + c.getId() + ", \"" + c.getName() + "\"," + c.getAge() + ")";
            String sql = "INSERT INTO Child (id, fullName, ageMonth) VALUES (" + child.getId() + ",     \"" + child.getFullName() + "\"," + child.getAgeMonth() + ")";
            jdbcOperations.update(sql);
            //System.out.println("Created Record ID is = " +child.getId() +" Name is: " + child.getFullName());
            return;
        }


        public Child findChildById(int id) {

            String SQL = "select * from Child where id = 1";
            //Child child = (Child) jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new ChildMapper());
            Child child = (Child) jdbcOperations.queryForObject(SQL, new Object[]{id}, new ChildMapper());

            return child;

        }

        public Child findChildByName(String fullName) {

            String SQL = "SELECT * from Child WHERE fullName = ?";
            //Child child = (Child) jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new ChildMapper());
            Child child = (Child) jdbcOperations.queryForObject(SQL, new Object[]{fullName}, new ChildMapper());

            return child;

        }

    /*    public List<Child> listAllChildren() {

            String SQL = "select * from Child";
            //List <Child> children = jdbcTemplateObject.query(SQL, new ChildMapper());
            List <Child> children = jdbcOperations.query(SQL, new ChildMapper());
            return children;

        }*/

        public List<Child> listAllChildren() {

            String SQL = "SELECT * from Child";
            List <Child> childrenList = jdbcOperations.query(SQL, new ChildMapper());

            System.out.println("Looping through ChildrenList:");
            for (Child currentChild : childrenList) {
            System.out.println("ID is: " + currentChild.getId() +", Name is: " + currentChild.getFullName() +", Age is: " + currentChild.getAgeMonth() +" months" );

        }

            return childrenList;
        }


        public void deleteRecord(int id) {

            String SQL = "delete from Child where id = 2";
            //jdbcTemplateObject.update(SQL);
            jdbcOperations.update(SQL);

            System.out.println("Deleted Record with ID = " + id );
            return;

        }

        public void updateRecord(int id, int ageMonth){

            //Sample --> String SQL = "SELECT * from Child WHERE fullName = ?";
            //Old   -->  String SQL = "update Child set ageMonth = 11 where id = 16";
            String SQL = "update Child set ageMonth = ? where id = ?";
            //String sql = "INSERT INTO Child (id, fullName, ageMonth) VALUES (" + child.getId() + ",     \"" + child.getFullName() + "\"," + child.getAgeMonth() + ")";

            //jdbcTemplateObject.update(SQL);
            jdbcOperations.update(SQL);
            //System.out.println("Updated Record with ID = " + id );
            return;
        }

}
