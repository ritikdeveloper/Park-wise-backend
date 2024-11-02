package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.services.userAuthService;
import net.engineeringdigest.journalApp.units.userAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class userAuthController {
    @Autowired
    private userAuthService service;
    @PostMapping
    public userAuth saveUser(@RequestBody userAuth user){
        return service.saveUser(user);

    }

}
