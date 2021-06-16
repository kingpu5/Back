package com.pfe.projet.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.projet.entité.Attachement;
import com.pfe.projet.repositories.AttachementRepository;
import com.pfe.projet.service.AttachementService;

@Service
public class AttachementServiceImpl implements AttachementService {

	@Autowired
    private AttachementRepository attachementRepository;
	
	
	@Override
	public Attachement createAttachement(Attachement att) {
		
		return attachementRepository.save(att) ;
	}

	
	@Override
	public Attachement getByIdAttachement(Integer id) {
		
		return attachementRepository.getOne(id);
	}

	
	@Override
	public List<Attachement> getAll() {
		
		return (List<Attachement>) attachementRepository.findAll();
	}

	
	@Override
	public void DeleteById(Integer id) {
		try {
			attachementRepository.deleteById(id);
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
	}

	
	@Override
	public Attachement editAttachement(Attachement att) {
		
		return attachementRepository.save(att);
	}
	

}
