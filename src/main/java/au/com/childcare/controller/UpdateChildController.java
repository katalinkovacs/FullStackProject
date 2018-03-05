package au.com.childcare.controller;

import au.com.childcare.dao.ChildDAOImplementation;
import au.com.childcare.dataobject.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/updatechild")
public class UpdateChildController {

    //Reference
    private ChildDAOImplementation childDAOImplementation;

    @Autowired
    public UpdateChildController(ChildDAOImplementation childDAOImplementation) {

        this.childDAOImplementation = childDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String childToBeUpdated(Model model) {

        return "childToBeUpdated";
    }

    @RequestMapping(method = POST)
    public String updatedChild(Child formData, Model model){

        int id = formData.getId();
        String name = formData.getFullName();
        int age = formData.getAgeMonth();

        childDAOImplementation.updateRecord(id, age);

        model.addAttribute("child" , formData);

        return "updatedChildInDb";
    }


}
