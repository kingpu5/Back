package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.DemandeAchat;

@Repository
public interface DemandeAchatRepository extends JpaRepository<DemandeAchat, Integer> {

}
