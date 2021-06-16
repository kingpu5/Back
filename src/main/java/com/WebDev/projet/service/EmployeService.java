package com.pfe.projet.service;
import java.util.List;
import com.pfe.projet.entité.Employe;

public interface EmployeService {
	
	Employe createEmploye (Employe emp);
	Employe getByIdEmploye (Long id);
	List<Employe> getAll();
	void deleteById(Long id);
	Employe editEmploye(Employe emp);
	
}
