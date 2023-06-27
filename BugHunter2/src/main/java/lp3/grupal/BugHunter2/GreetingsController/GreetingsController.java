/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.GreetingsController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.web.SecurityFilterChain;
/**
 *
 * @author anali
 */

@RestController
@RequestMapping("/user/")
public class GreetingsController {
    public ResponseEntity<String> sayHello()
    {
        return ResponseEntity.ok("Hello from our API");
    }
    
    @GetMapping("/user/")
    public ResponseEntity<String> sayGoodBye()
    {
           return ResponseEntity.ok("Goodbye and see you later");
    }
}