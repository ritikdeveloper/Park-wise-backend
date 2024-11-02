package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.units.userUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import net.engineeringdigest.journalApp.repo.userRepository;

import java.util.List;

@Component
public class userServices {
    @Autowired
    private userRepository userrepo;

    public List<userUnit> getdetails(){
      return  userrepo.findAll();
    }
    public userUnit adduser(userUnit user){
        return userrepo.save(user);
    }

}
