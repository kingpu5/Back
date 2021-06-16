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
import com.pfe.projet.entité.DemandeConge;
import com.pfe.projet.service.DemandeCongeService;


@RestController
public class DemandeCongeController {
	
	
	@Autowired
	public DemandeCongeService demandeCongeService;
	
	
	 @PostMapping("DemandeConge")
	    public Object CreateDemandeConge(@RequestBody DemandeConge dc)
	    {
		     dc = demandeCongeService.createDemandeConge(dc);
			return ResponseEntity.status(HttpStatus.FOUND).body(dc);
		 
	    }
	 
	 
	 @GetMapping("DemandeConge/{id}")
	    public Object getbYId(@PathVariable("id") Integer idds)
	    {
	        DemandeConge dc = demandeCongeService.getByIdDemandeConge(idds);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(dc);
	    }
	 
	 
	 @GetMapping("DemandeConge")
	    public Object getAll()
	    {
	        List<DemandeConge> listds = demandeCongeService.getAll();
	        return  ResponseEntity.status(HttpStatus.FOUND).body(listds);
	    }
	 
	 

	    @DeleteMapping("DemandeConge/{id}")
	    public void deleteByid(@PathVariable Integer id)
	    {
	    	demandeCongeService.deleteById(id);
	    }
	    
	    
	    
	    @PutMapping("DemandeConge")
	    public Object editDemandeConge(@RequestBody DemandeConge dc)
	    {
	        dc = demandeCongeService.editDemandeConge(dc);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(dc);
	    }


	    
}
