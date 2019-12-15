package com.autoecole.kada.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

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
//	@Lob
//	@Size(max = 2000000000)
//	private byte[] image;
	private Date dateNaiss;
	private String sexe;
	private String adresse;
	private String nrotel ;
	private String cin ;
	private String email ;


	public Candidat(String nom, String prenom, Date dateNaiss, String sexe, String adresse, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.sexe = sexe;
		this.adresse = adresse;
		this.email = email;
	}
}
