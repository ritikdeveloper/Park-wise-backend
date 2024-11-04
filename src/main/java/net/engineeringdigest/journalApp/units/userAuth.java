package net.engineeringdigest.journalApp.units;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "UserAuth")
public class userAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Userid;
    private String username;
    private String Password;
    private String role;
}
