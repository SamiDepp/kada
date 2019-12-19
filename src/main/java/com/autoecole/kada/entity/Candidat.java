package com.autoecole.kada.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="candidat")
@Data
@NoArgsConstructor
public class Candidat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nom ;
	private String prenom ;
	private String nomJF ;
//	@Lob
//	@Size(max = 2000000000)
//	private byte[] image;
	private Date dateNaiss;
	private String sexe;
	private String adresse;
	private String tel;
	private String cin ;
	private String email ;

	private String comm_enr , comm_resid;
	private String prenomP, nomM, prenomM;
	private String nation, sang_grp, sit_fam;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "candidat_examen",
			joinColumns = @JoinColumn(name = "candidat_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "examen_id", referencedColumnName = "id"))
	@JsonIgnore
	private List<Examen> examens;


	public Candidat(String nom, String prenom, Date dateNaiss, String sexe, String adresse, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.sexe = sexe;
		this.adresse = adresse;
		this.email = email;
	}
}
