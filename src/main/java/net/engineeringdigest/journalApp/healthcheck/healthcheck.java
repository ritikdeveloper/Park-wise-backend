package net.engineeringdigest.journalApp.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    @GetMapping("/health-check")
        public String health(){
        return "perfectlyfine";
        }
}
