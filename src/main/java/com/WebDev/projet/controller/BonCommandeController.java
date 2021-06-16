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

import com.pfe.projet.entité.BonCommande;
import com.pfe.projet.service.BonCommandeService;

@RestController
public class BonCommandeController {
	
@Autowired
public BonCommandeService bonCommandeService ;


@PostMapping("BonCommande")
public Object createBonCommande (@RequestBody BonCommande bc) {
	bc = bonCommandeService.createBonCommande(bc);
	return ResponseEntity.status(HttpStatus.FOUND).body(bc);
	
}
@GetMapping("BonCommande /{id}")
public Object getBonCommande (@PathVariable Integer idds) {
	BonCommande bc = bonCommandeService.getByIdBonCommande(idds);
	return ResponseEntity.status(HttpStatus.FOUND).body(bc);
}

@GetMapping("BonCommande")
public Object getAll() {
	List<BonCommande> listBonCommande = bonCommandeService.getAll();
	return ResponseEntity.status(HttpStatus.FOUND).body(listBonCommande );
}
@DeleteMapping ("BonCommande/{id}")
public void deleteById(@PathVariable Integer id) {
	bonCommandeService.deleteById(id);
}
@PutMapping("BonCommande")
public Object editBonCommande (@RequestBody BonCommande bc) {
	bc = bonCommandeService.editBonCommande(bc);
	return ResponseEntity.status(HttpStatus.FOUND).body(bc);
	
}

}
