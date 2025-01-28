package net.engineeringdigest.journalApp.units;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="car")
public class carunits {
    @Id
    private String numberplate;
    private String Brand;
    private String Model;
    private int location ;
}

