package com.pfe.projet.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pfe.projet.entité.DemandeConge;


@Repository
public interface DemandeCongeRepository extends JpaRepository<DemandeConge, Integer>{

}
