package net.engineeringdigest.journalApp.repo;

import net.engineeringdigest.journalApp.units.userUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userUnit,Long> {
}
