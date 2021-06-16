package com.pfe.projet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.projet.entité.DemandeConge;
import com.pfe.projet.repositories.DemandeCongeRepository;
import com.pfe.projet.service.DemandeCongeService;

@Service
public class DemandeCongeServiceImpl implements DemandeCongeService {

	@Autowired
	public DemandeCongeRepository demandeCongeRepository;
	
	
	@Override
	public DemandeConge createDemandeConge(DemandeConge dc) {
		return demandeCongeRepository.save(dc);
	}

	
	@Override
	public DemandeConge getByIdDemandeConge(Integer id) {
		return demandeCongeRepository.getOne(id);
	}

	
	@Override
	public List<DemandeConge> getAll() {
		return (List<DemandeConge>) demandeCongeRepository.findAll();
	}

	
	@Override
	public void deleteById(Integer id) {
		try {
		demandeCongeRepository.deleteById(id);
	}
		catch (Exception e) {
			System.out.println("id inexistant");
			
		}}
		

	
	@Override
	public DemandeConge editDemandeConge(DemandeConge dc) {
		return demandeCongeRepository.save(dc);
	}

}
