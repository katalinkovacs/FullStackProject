package au.com.childcare.controller;

import au.com.childcare.dao.ChildDAOImplementation;
import au.com.childcare.dataobject.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/*Because ChildrenListController is annotated with @Controller,
 the component scanner will automatically pick up ChildrenListController
 and declare it as a bean in the Spring application context.
*/
@Controller    //Declared to be a controller
@RequestMapping(value = "/childrenlistdisplay")   //Handle GET requests for /childrenlistdisplay
public class ChildrenListController {

    //Reference
    private ChildDAOImplementation childDAOImplementation;

    @Autowired
    public ChildrenListController(ChildDAOImplementation childDAOImplementation) {

        this.childDAOImplementation = childDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String showChildrenList(Model model) {

        List<Child> childrenList =  childDAOImplementation.listAllChildren();

        model.addAttribute("children", childrenList);
        return "childrenListDisplay";     // View name is childrenListDisplay
    }


}
