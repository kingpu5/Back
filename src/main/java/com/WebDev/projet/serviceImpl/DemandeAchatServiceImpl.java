package com.pfe.projet.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.projet.entité.DemandeAchat;
import com.pfe.projet.repositories.DemandeAchatRepository;
import com.pfe.projet.service.DemandeAchatService;

@Service
public class DemandeAchatServiceImpl implements DemandeAchatService{
	
	
	@Autowired
    private DemandeAchatRepository demandeAchatRepository;	
	
	
	@Override
	public DemandeAchat createDemandeAchat(DemandeAchat da) {
		return demandeAchatRepository.save(da);
	}

	
	@Override
	public DemandeAchat getByIdDemandeAchat(Integer id) {
		return demandeAchatRepository.getOne(id);
	}

	
	@Override
	public List<DemandeAchat> getAll() {
		return (List<DemandeAchat>) demandeAchatRepository.findAll();
	}

	
	@Override
	public void deleteById(Integer id) {
		try {
		demandeAchatRepository.deleteById(id);
		}
		catch (Exception e) {
			System.out.println("id introuvable");
		}
	}

	
	@Override
	public DemandeAchat editDemandeAchat(DemandeAchat da) {
		
		return demandeAchatRepository.save(da)	;
	}
	

}
