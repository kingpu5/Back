package com.pfe.projet.service;

import java.util.List;

import com.pfe.projet.entité.BonCommande;


public interface BonCommandeService {
	
	BonCommande createBonCommande (BonCommande bc);
	BonCommande getByIdBonCommande (Integer id);
	List<BonCommande> getAll();
	void deleteById(Integer id);
	BonCommande editBonCommande(BonCommande bc);
	
}
