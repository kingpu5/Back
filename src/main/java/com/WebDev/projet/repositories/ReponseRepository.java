package com.pfe.projet.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse, Integer> {

}
