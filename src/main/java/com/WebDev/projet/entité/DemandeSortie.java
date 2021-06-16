package com.pfe.projet.entité;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
public class DemandeSortie implements Serializable {
	private static final long serialVersionUID = 1L; 

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date dateDemande;

    private Date datePrevue;

    private Date dateEffctive;

    private String heureSortie;

    private Date dateActuel;

    private String motif;
    
    
    @OneToOne
  	private Reponse reponse;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="demandeSortie")
	private Set<Attachement> Attachement;
    
    
    @ManyToOne
	Employe employe;
    
  

}
