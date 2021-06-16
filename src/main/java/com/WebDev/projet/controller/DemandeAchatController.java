package com.pfe.projet.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.projet.entité.DemandeAchat;
import com.pfe.projet.service.DemandeAchatService;

@RestController
public class DemandeAchatController {
	
	
	@Autowired
	public DemandeAchatService demandeAchatService ;
	
	

	@PostMapping("DemandeAchat")
	public Object createDemandeAchat (@RequestBody DemandeAchat da) {
		da = demandeAchatService.createDemandeAchat(da);
				return  ResponseEntity.status(HttpStatus.FOUND).body(da);
	}
	
	
	
	@GetMapping ("DemandeAchat/{id}")
	public Object getById (@PathVariable("id") Integer ids) {
		 DemandeAchat da = demandeAchatService.getByIdDemandeAchat(ids);
		 return  ResponseEntity.status(HttpStatus.FOUND).body(da);	
	}
	
	
	@GetMapping("DemandeAchat")
    public Object getAll()
    {
        List<DemandeAchat> listda = demandeAchatService.getAll();
        return  ResponseEntity.status(HttpStatus.FOUND).body(listda);
    }
	
	
	 @DeleteMapping("Demandeachat/{id}")
	    public Object deleteByid(@PathVariable Integer id)
	    {
	    	 demandeAchatService.deleteById(id);
	    	return  ResponseEntity.status(HttpStatus.FOUND).body(null);
	    }
	 

	 
	    
	    @PutMapping("DemandeAchat")
	    public Object editDemandeAchat(@RequestBody DemandeAchat da)
	    {
	        da = demandeAchatService.editDemandeAchat(da);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(da);
	    }
	    
	    

}
