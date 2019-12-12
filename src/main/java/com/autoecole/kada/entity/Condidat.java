package com.autoecole.kada.entity;


import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="condidat")
@Data
public class Condidat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nom ;
	private String prenom ;
	@Lob
	@Size(max = 2000000000)
	private byte[] image;
	private Date dateNaiss;
	private String sexe;
	private String adresse;
	private String nrotel ;
	private String cin ;
	private String email ;
	

	
	


}
