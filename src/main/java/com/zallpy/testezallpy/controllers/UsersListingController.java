package com.zallpy.testezallpy.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zallpy.testezallpy.entities.User;
import com.zallpy.testezallpy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UsersListingController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String usersListing(){

        userService.createRandomUsers();

        return "usersListing";
    }

    @RequestMapping("/usersTable")
    public ResponseEntity<?> getUploadClassesNamesJson() throws JsonProcessingException {
        List<User> users = userService.findAll();

        String usersJson = new ObjectMapper().writeValueAsString(users);

        return new ResponseEntity(usersJson, HttpStatus.OK);
    }
}
