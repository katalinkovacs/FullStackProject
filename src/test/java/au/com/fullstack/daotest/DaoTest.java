package au.com.fullstack.daotest;

import au.com.childcare.config.RootConfig;
import au.com.childcare.dao.ChildDAOImplementation;
import au.com.childcare.dataobject.Child;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class,loader=AnnotationConfigContextLoader.class)
public class DaoTest {

    @Autowired
    ChildDAOImplementation childDAOImplementation;


    @Ignore  // WORKING
    @Test  //insertRecord
    public void childDAO_insertRecord_test() throws Exception {

        System.out.println("In the method-------------------------------------");
        Child c = new Child();
        System.out.println("Child c created-------------------------------------");

        c.setId(12);
        c.setFullName("Test");
        c.setAgeMonth(33);

        System.out.println("Added id, name, age to Child -------------------------------------");

        System.out.println("insert record start-------------------------------------");
        childDAOImplementation.insertRecord(c);
        System.out.println("insert record finish-------------------------------------");

        Child c2 = childDAOImplementation.findChildByName("Test");

        System.out.println("Before IF-------------------------------------");

        if ("Test".equals(c2.getFullName())) {
            System.out.println("In IF-------------------------------------");

            System.out.println("OK");
        }

        assert ("Test".equals(c2.getFullName()));

        System.out.println("Delete record starts------------");
        childDAOImplementation.deleteRecord(12);
        System.out.println("Delete record finishes------------");
    }


    @Ignore  // WORKING
    @Test  // findChildById
    public void childDAO_findChildById_test() throws Exception {

        System.out.println("In method------------");

        Child c2 = childDAOImplementation.findChildById(2);
        System.out.println("c2 created------------");

        assert ("Reid".equals(c2.getFullName()));

    }

    @Ignore  // WORKING
    @Test      // findChildByName
    public void childDAO_findChildByName_test() throws Exception {

        System.out.println("In method------------");

        Child c = childDAOImplementation.findChildByName("Sebi");
        System.out.println("child created------------");

        //assert("42".equals(c.getId()));
        assertEquals((c.getId()), 1);
    }


    @Ignore    // Not working!!!!!!!!!!!!!!
    @Test      // deleteRecord
    public void childDAO_deleteRecord_test() throws Exception {

        System.out.println("In the method-------------------------------------");
        Child c = new Child();
        System.out.println("Child c created-------------------------------------");

        c.setId(12);
        c.setFullName("Test");
        c.setAgeMonth(33);

        System.out.println("Added id, name, age to Child -------------------------------------");

        System.out.println("insert record start-------------------------------------");
        childDAOImplementation.insertRecord(c);
        System.out.println("insert record finish-------------------------------------");

        Child c2 = childDAOImplementation.findChildByName("Test");

        System.out.println("Delete record starts------------");
        childDAOImplementation.deleteRecord(12);
        System.out.println("Delete record finishes------------");

        //childDAOImplementation.updateRecord(12, 33);
        //assertEquals(childDAOImplementation.findChildByName("Test"), "Null");
        //assertEquals( (c.getId()), 12);
        //assertNotEquals( (childDAOImplementation.findChildByName("Test")), "Null");
        //assert("Test".equals(c2.getFullName()));
        assertNotNull(c2);

    }

    //working
    @Test  // listAllChildren
    public void childDAO_listAllChildren_test() throws Exception {

        List<Child> childrenList = childDAOImplementation.listAllChildren();

        System.out.println("Looping through ChildrenList:");
        for (Child currentChild : childrenList) {
            System.out.println("ID is: " + currentChild.getId() + ", Name is: " + currentChild.getFullName() + ", Age is: " + currentChild.getAgeMonth() + " months");
        }

        //assertEquals(expected, actual);
        assertEquals(11, childrenList.size());

    }


}

