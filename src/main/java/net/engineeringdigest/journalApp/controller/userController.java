package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.services.userServices;
import net.engineeringdigest.journalApp.units.userUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class userController {
    @Autowired
    private userServices userservice;

    @GetMapping
    public List<userUnit> getdetails(){
        return userservice.getdetails();
    }

    @PostMapping
    public userUnit addUser(@RequestBody userUnit user){
        return userservice.adduser(user);
    }

}
