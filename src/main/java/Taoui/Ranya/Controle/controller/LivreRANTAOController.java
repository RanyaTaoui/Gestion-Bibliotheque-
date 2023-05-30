package Taoui.Ranya.Controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Taoui.Ranya.Controle.model.LivreRANTAO;
import Taoui.Ranya.Controle.repository.LivreRANTAORepository;

@RestController
@RequestMapping("/livre")
@CrossOrigin("http://localhost:3000")
public class LivreRANTAOController {
	@Autowired
private LivreRANTAORepository livreRepository;

	@PostMapping
	public void ajouterLivre(@RequestBody LivreRANTAO p) {
		 livreRepository.save(p);
	}
	@GetMapping
	public List<LivreRANTAO> getLivres(){
		return livreRepository.findAll();
	}
	
	@DeleteMapping("/{idL}")
	public void del(@PathVariable int id) {
	livreRepository.deleteById(id);
	}
}	
