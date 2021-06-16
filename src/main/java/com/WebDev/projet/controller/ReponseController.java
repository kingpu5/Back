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
import com.pfe.projet.entité.Reponse;
import com.pfe.projet.service.ReponseService;



@RestController
public class ReponseController {
	

	
@Autowired
public ReponseService reponseService ;



@PostMapping("Reponse")
public Object createReponse (@RequestBody Reponse rep) {
	rep = reponseService.createReponse(rep);
			return  ResponseEntity.status(HttpStatus.FOUND).body(rep);
}



@GetMapping ("Reponse/{id}")
public Object getById (@PathVariable("id") Integer ids) {
	Reponse rep = reponseService.getByIdReponse(ids);
	 return  ResponseEntity.status(HttpStatus.FOUND).body(rep);	
}



@GetMapping("Reponse")
public Object getAll()
{
    List<Reponse> listda = reponseService.getAll();
    return  ResponseEntity.status(HttpStatus.FOUND).body(listda);
}



 @DeleteMapping("DemandeAchat/{id}")
    public void deleteByid(@PathVariable Integer id)
    {
    	reponseService.deleteById(id);
    }
    
 
 
    @PutMapping("Reponse")
    public Object editReponse(@RequestBody Reponse rep)
    {
        rep = reponseService.editReponse(rep);
        return  ResponseEntity.status(HttpStatus.FOUND).body(rep);
    }
    
    
}
