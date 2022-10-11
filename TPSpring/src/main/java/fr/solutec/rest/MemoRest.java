package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.repository.MemoRepository;

@RestController
@CrossOrigin("*") //Visibilité de l'api par tout le monde

public class MemoRest {
	@Autowired
	private MemoRepository memoRepos;

	@GetMapping("memo")
	public Iterable<Memo> getAllMemo() {
		return memoRepos.findAll();
	}
	
	@GetMapping("memo/{idMemo}")
	public Optional<Memo> getDateMemo(@PathVariable Long idMemo) {
		return memoRepos.findByIdMemo(idMemo);
	}
	
	@PostMapping("memo")
	public Memo createMemo(@RequestBody Memo m) {
		return memoRepos.save(m);
	}
	
	@DeleteMapping("memo/{idMemo}")
	public boolean suppMemo(@PathVariable Long idMemo) {
		Optional<Memo> p = memoRepos.findById(idMemo);
		if (p.isPresent()) {
			memoRepos.deleteById(idMemo);
			return true;
		} else {
			return false;
		}
	}
	
	@GetMapping("memo/user/{id}")
	public List<Memo> getMemoUser(@PathVariable Long idUser) {
		return memoRepos.findByUserId(idUser);
	}
	
}
