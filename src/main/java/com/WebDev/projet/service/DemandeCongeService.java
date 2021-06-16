package com.pfe.projet.service;
import java.util.List;

import com.pfe.projet.entité.DemandeConge;


public interface DemandeCongeService {
	
	DemandeConge createDemandeConge (DemandeConge dc);
	DemandeConge getByIdDemandeConge (Integer id);
	List<DemandeConge> getAll();
	void deleteById(Integer id);
	DemandeConge editDemandeConge(DemandeConge dc);
	
}
