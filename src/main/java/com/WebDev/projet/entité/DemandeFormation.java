package com.pfe.projet.entité;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class DemandeFormation implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;

	private Date dateDemande;

	 private String foramtionDemandee;
	 
	 private String objectifs;
	 
	 private String populationCible;

	 private String duree;

	 private String nomFormateur;

	 private String posteFormateur;

	 private String nomOrganisme;
	 
	 private Float fraisFormation;

	 private String modeFinancement;

	 private String observations;

	 private String typeFormation;
	 
	 

	 @ManyToOne
		Employe employe;
	 
	 
	 @OneToOne
		private Reponse reponse;
	 
	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy="demandeFormation")
		private Set<Attachement> Attachement;
	    
}
