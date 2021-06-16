package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer>{
	

}
