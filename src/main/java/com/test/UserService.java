package com.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {

    private String dateTimeString = LocalDateTime.now().toString();

    public String getMessage() {
        return dateTimeString;
    }
}
