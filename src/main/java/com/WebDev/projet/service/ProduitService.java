package com.pfe.projet.service;

import java.util.List;

import com.pfe.projet.entité.Produit;

public interface ProduitService {
	
	Produit createProduit (Produit produit);
	Produit getByIdProduit (Integer id);
	List<Produit> getAll();
	void deleteById (Integer id);
	Produit editProduit (Produit produit);

}
