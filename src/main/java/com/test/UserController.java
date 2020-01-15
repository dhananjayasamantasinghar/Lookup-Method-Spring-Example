package com.test;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class UserController {
    
    private static int count;

    @Lookup
    public abstract UserService getSrvService();
    
    @GetMapping("/get")
    public ResponseEntity<User> getMessage() throws Exception{
        count++;
        User user = new User();
        user.setMob("9040010798");
        user.setUserAddress("Bangalore");
        user.setUserName(getSrvService().getMessage("Dhananjaya-"+count));
        return ResponseEntity.ok(user);
    }
  
    
}
