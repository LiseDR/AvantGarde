package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@RestController
@CrossOrigin("*")
public class UserRest {

	@Autowired
	private UserRepository userRepos;

	@GetMapping("user")
	public Iterable<User> getAllUser() {
		return userRepos.findAll();

	}

	@PostMapping("user")
	public User createUser(@RequestBody User u) {
		return userRepos.save(u);
	}

	@PostMapping("login")
	public Optional<User> connectionUser(@RequestBody User u) {
		return userRepos.findByLoginAndMdp(u.getLogin(), u.getMdp());

	}
	

}
