package com.pfe.projet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.projet.entité.Employe;
import com.pfe.projet.repositories.EmployeRepository;
import com.pfe.projet.service.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService{


	@Autowired
    private EmployeRepository employeRepository;
	@Override
	public Employe createEmploye(Employe emp) {
		return employeRepository.save(emp);
	}

	@Override
	public Employe getByIdEmploye(Long id) {
		
		return employeRepository.getOne(id);
	}

	@Override
	public List<Employe> getAll() {
		
		return (List<Employe>) employeRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		try {
			employeRepository.deleteById(id);
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
		
	}

	@Override
	public Employe editEmploye(Employe emp) {
		return employeRepository.save(emp);
	}

}
