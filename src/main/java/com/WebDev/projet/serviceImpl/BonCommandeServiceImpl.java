package com.pfe.projet.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.projet.entité.BonCommande;
import com.pfe.projet.repositories.BonCommandeRepository;
import com.pfe.projet.service.BonCommandeService;

@Service
public class BonCommandeServiceImpl implements BonCommandeService{

	@Autowired
    private BonCommandeRepository bonCommandeRepository;	
	
	
	@Override
	public BonCommande createBonCommande(BonCommande bc) {
		return bonCommandeRepository.save(bc);
	}
	

	@Override
	public BonCommande getByIdBonCommande(Integer id) {
		return bonCommandeRepository.getOne(id);
	}
	

	@Override
	public List<BonCommande> getAll() {
		return (List<BonCommande>)bonCommandeRepository.findAll();
		}
	

	@Override
	public void deleteById(Integer id) {
		try {
			bonCommandeRepository.deleteById(id);
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
	}

	
	@Override
	public BonCommande editBonCommande(BonCommande bc) {
		
		return bonCommandeRepository.save(bc)	;
		}

	
}
