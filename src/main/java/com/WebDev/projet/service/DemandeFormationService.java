package com.pfe.projet.service;
import java.util.List;
import com.pfe.projet.entité.DemandeFormation;

public interface DemandeFormationService {
	
	DemandeFormation CreateDemandeFormation(DemandeFormation df);
	DemandeFormation GetByIdDemandeFormation (Integer id);
	List<DemandeFormation> GetAll();
	void DeleteById(Integer id);
	DemandeFormation EditDemandeFormation(DemandeFormation df);
	
}
