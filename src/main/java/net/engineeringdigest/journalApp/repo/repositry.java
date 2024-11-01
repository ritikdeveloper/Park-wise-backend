package net.engineeringdigest.journalApp.repo;

import net.engineeringdigest.journalApp.units.carunits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositry extends JpaRepository<carunits, Long> {
}
