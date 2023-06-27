package lp3.grupal.BugHunter2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller 
public class indexController {
        
    @RequestMapping(value="/")
    public String menu(Model model){
        return "menu/menu";
    }
    @RequestMapping(value="/i")
    public String index(Model model){
        return "comunes/templateUsu";
    }
}

