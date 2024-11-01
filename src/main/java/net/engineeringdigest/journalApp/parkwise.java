package net.engineeringdigest.journalApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081")
@EnableJpaRepositories("net.engineeringdigest.journalApp.repo")
@SpringBootApplication
public class parkwise {

    public static void main(String[] args) {
        SpringApplication.run(parkwise.class, args);


    }


}