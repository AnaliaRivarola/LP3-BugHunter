/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.grupal.BugHunter2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author YOII
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String iniciarSesion(){
        return "login";
    }
    
    @GetMapping("/")
    public String verInicio(){
        return "menu";
    }
}
