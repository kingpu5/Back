package com.pfe.projet.service;
import java.util.List;
import com.pfe.projet.entité.DemandeAchat;


public interface DemandeAchatService {
	
	DemandeAchat createDemandeAchat (DemandeAchat da);
	DemandeAchat getByIdDemandeAchat (Integer id);
	List<DemandeAchat> getAll();
	void deleteById(Integer id);
	DemandeAchat editDemandeAchat(DemandeAchat da);
	
}
