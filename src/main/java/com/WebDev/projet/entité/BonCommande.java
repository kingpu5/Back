package com.pfe.projet.entité;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class BonCommande implements Serializable {
	private static final long serialVersionUID = 1L; 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_bon;

	private Date date_bon;

	private Long fax;

	private Long telephone;

	private String modeExpedition;

	private Date delaiLivraison;

	private String devise;

	private Integer quantite;

	private String designation;

	private Float PU_HTVA;

	private Integer Taux_TVA;
	
	@OneToOne(mappedBy="bonCommande")
	private DemandeAchat demandeAchat; 
}
