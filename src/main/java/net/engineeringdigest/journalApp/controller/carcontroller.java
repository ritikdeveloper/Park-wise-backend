package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.services.carservice;
import net.engineeringdigest.journalApp.units.carunits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api")
@RestController
public class carcontroller {
    @Autowired
    private carservice carservice;

    @GetMapping
    public List<carunits> getdetails(){
        return carservice.details();
    }
    @PostMapping
    public carunits savecar(@RequestBody carunits car){
        return carservice.addcar(car);
    }





}
