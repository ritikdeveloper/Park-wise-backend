package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.repo.userAuthRepo;
import net.engineeringdigest.journalApp.units.userAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userAuthService {

    @Autowired
    private userAuthRepo repo;

    public userAuth saveUser(userAuth user){
        return repo.save(user);
    }
}
