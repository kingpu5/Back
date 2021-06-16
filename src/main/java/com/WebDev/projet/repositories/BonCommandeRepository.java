package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.BonCommande;

@Repository
public interface BonCommandeRepository extends JpaRepository<BonCommande, Integer>{

}
