package net.engineeringdigest.journalApp.units;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="car")
public class carunits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String Numberplate;
    private  String Brand;
    private String Model;


}
