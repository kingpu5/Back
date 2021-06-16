package com.pfe.projet.entité;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Attachement implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String image;
	
	private String motif;
	
	    @ManyToOne
	    private DemandeAchat demandeAchat;
	    
	    
	    @ManyToOne
	    private DemandeSortie demandeSortie;
	    
	    
	    @ManyToOne
	    private DemandeFormation demandeFormation;
	    
	    
	    @ManyToOne
	    private DemandeConge demandeConge;
	    
	    
	    

}
