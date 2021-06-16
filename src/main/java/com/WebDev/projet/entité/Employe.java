package com.pfe.projet.entité;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Employe implements Serializable {
	private static final long serialVersionUID = 1L; 

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long matricule;

    private String nom;

    private String prenom;

    private String poste;

//    //assocation
//    private Employe supHier;

    private String departement;

    private Long cin;

    private String email;

    private String motPasse;

    private String photo;

    private String role;

    private Date dateNaissance;

    private String lieuNaissance;

    private String etatCivil;

    private Integer nombreEnfant;

    private String nationnalite;

    private String adresse;

    private Integer codePostal;

    private Long telephoneMobile;

    private Long autreTel;

    private String contactAccident;

    private Long telephoneAccident;

    private String themeMemoire;

    private String pfe;

    private Date debutPrimaire;

    private Date finPrimaire;

    private String etablissmentPrimaire;

    private String diplomePrimaire;

    private Date debutSecondaire;
    private Date finSecondaire;
    private String etablissmentSecondaire;
    private String diplomeSecondaire;

    private Date debutSup;
    private Date finSup;
    private String etablissmentSup;
    private String diplomeSup;

    private Date debutFormationPro;
    private Date finFormationPro;
    private String etablissmentFormatioPro;
    private String diplomeFormationPro;

    private Date debutAutre;
    private Date finAutre;
    private String etablissmentAutre;
    private String diplomeAutre;


    private Integer ecritArabe;
    private Integer oralLuArabe;
    private Integer parleArabe;

    private Integer ecritFr;
    private Integer oralLuFr;
    private Integer parleFr;

    private Integer ecritAng;
    private Integer oralLuAng;
    private Integer parleAng;

    private Integer ecritObserv;
    private Integer oralLuObserv;
    private Integer parleObserv;

    private String societe;
    private String service1;
    private String periode1;

    private String societe1;
    private String service2;
    private String periode2;

    private String societe3;
    private String service3;
    private String periode3;

    private String seminaire1;
    private String seminaire2;
    private String seminaire3;
    private String seminaire4;
    private String seminaire5;


    private String cab1;
    private String cab2;
    private String cab3;
    private String cab4;
    private String cab5;

    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    
    
    private String lieu1;
    private String lieu2;
    private String lieu3;
    private String lieu4;
    private String lieu5;
    
    
    private Date periodeDate;
    private Date periodeDate2;
    private Date periodeDate3;
    
    
    private Float dernierSalaire;
    private Float dernierSalaire2;
    private Float dernierSaliare3;
    
    
    private String exSociete1;
    private String exSociete2;
    private String exSociete3;
    
    private String fonctionOccupee1;
    private String fonctionOccupee2;
    private String fonctionOccupee3;
    
    private String raisonDep1;
    private String raisonDep2;
    private String raisonDep3;
    
    
    private Integer nombreRetard;
    private Integer nombreJustification;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="employe")
    private Set<DemandeAchat> DemandeAchat;
  
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="employe")
    private Set<DemandeSortie> DemandeSortie;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="employe")
    private Set<DemandeFormation> DemandeFormation;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="employe")
    private Set<DemandeConge> DemandeConge;
    
    
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Employe> employe;
    
    
    @ManyToMany(mappedBy="employe", cascade = CascadeType.ALL)
    private Set<Employe> employes;



    
    
    

}
