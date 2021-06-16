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
import com.pfe.projet.entité.Attachement;
import com.pfe.projet.service.AttachementService;

@RestController
public class AttachementController {
	
	
@Autowired
public AttachementService attachementService;


@PostMapping("Attachement")
public Object CreateAttachement (@RequestBody Attachement att) {
	att = attachementService.createAttachement(att);
 return  ResponseEntity.status(HttpStatus.FOUND).body(att);
		
}

@GetMapping ("Attachement/{id}")
public Object getById (@PathVariable("id") Integer ids) {
	 Attachement att = attachementService.getByIdAttachement(ids);
	 return  ResponseEntity.status(HttpStatus.FOUND).body(att);	
}


@GetMapping("Attachement")
public Object getAll()
{
    List<Attachement> listatt = attachementService.getAll();
    return  ResponseEntity.status(HttpStatus.FOUND).body(listatt);
}


@DeleteMapping("Attachement/{id}")
public void deleteByid(@PathVariable Integer id)
{
	attachementService.DeleteById(id);
}



@PutMapping("Attachement")
public Object editAttachement(@RequestBody Attachement att)
{
    att = attachementService.editAttachement(att);
    return  ResponseEntity.status(HttpStatus.FOUND).body(att);
}
	


}

