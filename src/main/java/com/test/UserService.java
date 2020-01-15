package com.test;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Service;

@Service(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {

    private String userName;

    public String getMessage(String name) throws InterruptedException {
        userName = name;
        return userName;
    }
}
