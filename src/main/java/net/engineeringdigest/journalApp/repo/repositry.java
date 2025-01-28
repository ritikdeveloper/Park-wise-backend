package net.engineeringdigest.journalApp.repo;

import net.engineeringdigest.journalApp.units.carunits;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface repositry extends JpaRepository<carunits, Long> {
    carunits findByNumberplate(String numberplate);
}

