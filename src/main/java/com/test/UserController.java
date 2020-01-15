package com.test;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class UserController {

    @Lookup
    public abstract UserService getService();

    @GetMapping("/get")
    public ResponseEntity<User> getMessage() throws Exception {
        User user = new User();
        user.setMob("9040010798");
        user.setUserAddress("Bangalore");
        user.setUserName(getService().getMessage());
        return ResponseEntity.ok(user);
    }

}
