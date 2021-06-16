package com.pfe.projet.entité;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data

public class DemandeConge implements Serializable {
	private static final long serialVersionUID = 1L;  

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String adresseConge;

	    private Date debutConge;

	    private Date finConge;

	    private String typeConge;
	   
	    private String CongeRecuperation;

	    private Integer nbrJours;
	    
	    
	    @OneToOne
		private Reponse reponse;
	    
	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy="demandeConge")
		private Set<Attachement> Attachement;
	    
	    
	    @ManyToOne
		Employe employe;
		
}
