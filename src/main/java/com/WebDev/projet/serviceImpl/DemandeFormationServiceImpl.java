package com.pfe.projet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.projet.entité.DemandeFormation;
import com.pfe.projet.repositories.DemandeFormationRepository;
import com.pfe.projet.service.DemandeFormationService;

@Service
public class DemandeFormationServiceImpl implements DemandeFormationService {

	@Autowired
    private DemandeFormationRepository demandeFormationRepository;	
	
	@Override
	public DemandeFormation CreateDemandeFormation(DemandeFormation df) {
		
		return demandeFormationRepository.save(df);
	}

	@Override
	public DemandeFormation GetByIdDemandeFormation(Integer id) {
		
		return demandeFormationRepository.getOne(id);
	}

	@Override
	public List<DemandeFormation> GetAll() {
		return (List<DemandeFormation>) demandeFormationRepository.findAll();
	}

	@Override
	public void DeleteById(Integer id) {
		try {
			demandeFormationRepository.deleteById(id);
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
		}
		

	@Override
	public DemandeFormation EditDemandeFormation(DemandeFormation df) {
	
		return demandeFormationRepository.save(df);
	}

}
