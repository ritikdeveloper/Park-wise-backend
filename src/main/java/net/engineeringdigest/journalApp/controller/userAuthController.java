package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.services.userAuthService;
import net.engineeringdigest.journalApp.units.userAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class userAuthController {
    @Autowired
    private userAuthService services;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping
    public userAuth saveUser(@RequestBody userAuth user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return services.saveUser(user);

    }

}
