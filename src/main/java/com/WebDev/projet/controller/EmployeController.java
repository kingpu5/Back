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
import com.pfe.projet.entité.Employe;
import com.pfe.projet.service.EmployeService;


@RestController
public class EmployeController {
	
	
	@Autowired
	public EmployeService EmployeService;
	
	
	
	 @PostMapping("Employe")
	    public Object CreateEmploye(@RequestBody Employe emp)
	    {
		     emp = EmployeService.createEmploye(emp);
			return ResponseEntity.status(HttpStatus.FOUND).body(emp);
		 
	    }
	 
	 
	 @GetMapping("Employe/{id}")
	    public Object getbYId(@PathVariable("id") Long idds)
	    {
		 Employe emp = EmployeService.getByIdEmploye(idds);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(emp);
	    }
	 
	 
	 @GetMapping("Employe")
	    public Object getAll()
	    {
	        List<Employe> listds = EmployeService.getAll();
	        return  ResponseEntity.status(HttpStatus.FOUND).body(listds);
	    }

	 
	 
	    @DeleteMapping("employe/{id}")
	    public void deleteByid(@PathVariable Long id)
	    {
	    	EmployeService.deleteById(id);
	    }
	    
	    
	    
	    @PutMapping("Employe")
	    public Object editEmploye(@RequestBody Employe emp)
	    {
	        emp = 	EmployeService.editEmploye(emp);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(emp);
	    }


}
