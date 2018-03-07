package au.com.childcare.controller;

import au.com.childcare.dataobject.Child;
import au.com.childcare.dao.ChildDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/findchildbyname")
public class FindChildByNameController {

    //Reference
    private ChildDAOImplementation childDAOImplementation;

    @Autowired
    public FindChildByNameController(ChildDAOImplementation childDAOImplementation) {

        this.childDAOImplementation = childDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String findChild(Model model) {

        return "childToBeFoundByName";
    }

    @RequestMapping( method = POST )
    public String foundChild(Child formData, Model model) {

        String name = formData.getFullName();
        Child childObject = childDAOImplementation.findChildByName(name);
        model.addAttribute("child" , childObject);  // name, value

        return "foundChildDetails";
    }



}
