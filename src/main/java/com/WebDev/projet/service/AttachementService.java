package com.pfe.projet.service;
import java.util.List;
import com.pfe.projet.entité.Attachement;

public interface AttachementService {
	
	Attachement createAttachement (Attachement att);
	Attachement getByIdAttachement (Integer id);
	List<Attachement> getAll();
	void DeleteById(Integer id);
	Attachement editAttachement(Attachement att);
	
}
