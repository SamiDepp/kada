package com.autoecole.kada.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "examen")
@Data
@NoArgsConstructor
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    private String adresse;
    private String dicipline;


    /*  to avoid Lazy Loading Error
    Could not write JSON: failed to lazily initialize a collection of role: could not initialize proxy - no Session*/
    @ManyToMany(mappedBy = "examens", fetch = FetchType.EAGER)
    private List<Candidat> candidats;


}
