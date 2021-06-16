package com.pfe.projet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.projet.entité.Produit;
import com.pfe.projet.repositories.ProduitRepository;
import com.pfe.projet.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	public ProduitRepository produitRepository;
	
	
	@Override
	public Produit createProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public Produit getByIdProduit(Integer id) {
		return produitRepository.getOne(id);
	}

	@Override
	public List<Produit> getAll() {
		return (List<Produit>) produitRepository.findAll() ;
	}

	@Override
	public void deleteById(Integer id) {
		try {
			produitRepository.deleteById(id);
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
	}


	@Override
	public Produit editProduit(Produit produit) {
		return produitRepository.save(produit);
	}

}
