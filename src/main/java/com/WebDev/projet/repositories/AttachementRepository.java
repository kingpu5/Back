package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.Attachement;

@Repository
public interface AttachementRepository extends JpaRepository<Attachement, Integer> {

}
