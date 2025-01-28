package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.repo.repositry;
import net.engineeringdigest.journalApp.units.carunits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    public carunits searchbyplate(String numberplate){
       return repo.findByNumberplate(numberplate);
    }

    public boolean checkin(String numberplate) {
        // Retrieve the car unit by numberplate
        carunits car = repo.findByNumberplate(numberplate);
        if (car == null) {
            throw new IllegalArgumentException("Car with numberplate " + numberplate + " not found.");
        }

        // Toggle the location between 0 and 1
        car.setLocation(car.getLocation() == 0 ? 1 : 0);

        // Save the updated car unit back to the database
        repo.save(car);

        // Return true if the new location is 1, otherwise false
        return car.getLocation() != 0;
    }


}
