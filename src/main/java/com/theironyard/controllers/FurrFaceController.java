package com.theironyard.controllers;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by DrScott on 11/19/15.
 */
@RestController
public class FurrFaceController {

  /*  @PostConstruct
    public void init() throws InvalidKeySpecException, NoSuchAlgorithmException {
        User user = users.findOneByName("TheMan");
        if (user == null) {
            user = new User();
            user.name = "TheMan";
            user.password = PasswordHash.createHash("1234");
            users.save(user);
        }
    } */
}
