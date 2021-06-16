package com.pfe.projet.service;
import java.util.List;
import com.pfe.projet.entité.Reponse;


public interface ReponseService {
	
	Reponse createReponse (Reponse rep);
	Reponse getByIdReponse (Integer id);
	List<Reponse> getAll();
	void deleteById(Integer id);
	Reponse editReponse(Reponse rep);

}
