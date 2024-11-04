package net.engineeringdigest.journalApp.repo;

import net.engineeringdigest.journalApp.units.userAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userAuthRepo extends JpaRepository<userAuth,Long> {

    public userAuth findByusername(String username);
}
