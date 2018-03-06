package co.fullstack.daotest;


import co.fullstack.childcare.Child;
import co.fullstack.config.RootConfig;
import co.fullstack.model.ChildDAOImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class,loader=AnnotationConfigContextLoader.class)
public class DAOTest {



    @Autowired
    ChildDAOImplementation childDAOImplementation;


    @Test
    public void childDAOTest_whenChildInserted_thenViewDeleteSuccess() throws Exception{


        Child c = new Child();

        c.setId(99);
        c.setFullName("Sebastian");
        c.setAgeMonth(43);



        childDAOImplementation.insertRecord(c);


        Child c2 = childDAOImplementation.findChildById(99);

        assert("Sebastian".equals(c2.getFullName()));

        childDAOImplementation.deleteRecord(99);


    }



    @Test
    public void testFindChild() throws Exception{

        Child c2 = childDAOImplementation.findChildById(1);

        assert("Sebi".equals(c2.getFullName()));


    }

}
