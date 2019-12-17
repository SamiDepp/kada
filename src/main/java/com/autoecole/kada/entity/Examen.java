package com.autoecole.kada.entity;

import com.autoecole.kada.model.Dicipline;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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
    private Dicipline dicipline;


    @ManyToMany(mappedBy = "examens")
    private List<Candidat> candidats;


}
