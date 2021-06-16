package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.DemandeFormation;

@Repository
public interface DemandeFormationRepository extends JpaRepository<DemandeFormation, Integer> {

}
