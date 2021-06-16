package com.pfe.projet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.projet.entité.Reponse;
import com.pfe.projet.repositories.ReponseRepository;
import com.pfe.projet.service.ReponseService;

@Service
public class ReponseServiceImpl implements ReponseService {

	@Autowired
	private ReponseRepository reponseRepository;
	
	
	@Override
	public Reponse createReponse(Reponse rep) {
		
		return reponseRepository.save(rep);
	}

	
	@Override
	public Reponse getByIdReponse(Integer id) {
		
		return reponseRepository.getOne(id);
	}


	@Override
	public List<Reponse> getAll() {
		
		return (List<Reponse>) reponseRepository.findAll();
	}

	
	@Override
	public void deleteById(Integer id) {
		 try {
	            reponseRepository.deleteById(id);
	        }
	        catch (Exception e)
	        {
	            System.out.println("id inexistant");
	        }
	        }


	@Override
	public Reponse editReponse(Reponse rep) {
		
		return reponseRepository.save(rep);
	}

	
	
}
