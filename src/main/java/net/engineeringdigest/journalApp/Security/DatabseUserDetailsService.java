package net.engineeringdigest.journalApp.Security;

//import jdk.jfr.snippets.Snippets;
import net.engineeringdigest.journalApp.repo.userAuthRepo;
import net.engineeringdigest.journalApp.units.userAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DatabseUserDetailsService  implements UserDetailsService {

    @Autowired
    private userAuthRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userAuth userforauth = repo.findByusername(username);
        if(userforauth !=null){
            return User.withUsername(userforauth.getUsername())
                                            .password(userforauth.getPassword())
                    .roles(userforauth.getRole())
                    .build();

        }
        throw new UsernameNotFoundException("user not found");
    }
}
