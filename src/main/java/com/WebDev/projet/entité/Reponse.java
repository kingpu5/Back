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
public class Reponse  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  Integer id;

private Date dateReponse;

private String typeReponse;

private String remarque;

private String contenu;

@OneToOne(mappedBy="reponse")
private DemandeAchat demandeAchat; 

@OneToOne(mappedBy="reponse")
private DemandeSortie demandeSortie; 

@OneToOne(mappedBy="reponse")
private DemandeFormation Demandeformation; 

@OneToOne(mappedBy="reponse")
private DemandeConge demandeConge; 


}
