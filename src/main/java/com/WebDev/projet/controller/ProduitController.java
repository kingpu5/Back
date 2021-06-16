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
import com.pfe.projet.entité.Produit;
import com.pfe.projet.service.ProduitService;

@RestController
public class ProduitController {
	
	
	@Autowired
	public ProduitService produitService;
	
	
	@PostMapping ("Produit")
	public Object createProduit (Produit prod) {
	 prod = produitService.createProduit(prod);
		return  ResponseEntity.status(HttpStatus.FOUND).body(prod);	
	}
	
	
	@GetMapping ("Produit/{id}")
	public Object getByIdProduit (@PathVariable("id") Integer ids) {
		Produit prod = produitService.getByIdProduit(ids);
		 return  ResponseEntity.status(HttpStatus.FOUND).body(prod);	
	}
	
	
	@GetMapping("Produit")
    public Object getAll()
    {
        List<Produit> listprod = produitService.getAll();
        return  ResponseEntity.status(HttpStatus.FOUND).body(listprod);
    }
	
	
	 @DeleteMapping("produit/{id}")
	    public void deleteByid(@PathVariable Integer id)
	    {
	    	produitService.deleteById(id);
	    }
	    
	 
	    @PutMapping("Produit")
	    public Object editProduit(@RequestBody Produit prod)
	    {
	        prod = produitService.editProduit(prod);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(prod);
	    }

	

}
