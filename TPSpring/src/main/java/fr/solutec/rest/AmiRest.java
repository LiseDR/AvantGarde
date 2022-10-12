package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Ami;
import fr.solutec.repository.AmiRepository;

@RestController
@CrossOrigin("*") // n'importe qui peut consommer des api de cette classe
public class AmiRest {
	@Autowired
	private AmiRepository amiRepos;

	@GetMapping("mesamis/{id}")
	public Iterable<Ami> mesAmis(@PathVariable Long id) {
		return amiRepos.findAllByDemandeurOrReceveur(id, id);
	}

}
