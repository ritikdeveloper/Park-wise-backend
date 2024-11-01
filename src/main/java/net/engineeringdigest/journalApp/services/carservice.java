package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.repo.repositry;
import net.engineeringdigest.journalApp.units.carunits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class carservice {
    @Autowired
    private repositry repo;

    public List<carunits> details(){
        return repo.findAll();
    }
    public carunits addcar(carunits car){
        return repo.save(car);

    }

}
