package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
