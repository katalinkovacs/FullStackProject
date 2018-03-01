package co.fullstack.controller;

import co.fullstack.childcare.Child;
import co.fullstack.model.ChildDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/childrendisplay")
public class ChildrenController {

    private ChildDAOImplementation childDAOImplementation;

    @Autowired
    public ChildrenController(ChildDAOImplementation childDAOImplementation) {

        this.childDAOImplementation = childDAOImplementation;
    }

    @RequestMapping( method = GET )
    public String showChildrenList(Model model) {

        List<Child> childrenList =  childDAOImplementation.listAllChildren();

        model.addAttribute("children", childrenList);
        return "childrenListDisplay";
    }


}
