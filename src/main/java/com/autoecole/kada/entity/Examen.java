package com.autoecole.kada.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "examen")
@Data
@NoArgsConstructor
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date datedebutExam;
    private Date datefinExam;
    private String type;
    private Boolean resultat;

    @ManyToOne
    @JoinColumn(name = "id_condidat")
    private Candidat candidat;


}
