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
public class DemandeAchat implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	private Date dateDemande;

	private String objet;

	private String beneficiare;

	private Double coutMin;

	private Double coutMax;

	private Double budgetPrevu;

	private String fournisseur;

	private String modalitePayement;

	private Integer degreUrgence;
    	
	
	@OneToOne
	private Reponse reponse;
	
	@OneToOne
	private BonCommande bonCommande;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="demandeAchat")
	private Set<Produit> Produit;
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy="demandeAchat")
	private Set<Attachement> Attachement;
	
	@ManyToOne
	Employe employe;

}
