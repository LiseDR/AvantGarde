package fr.solutec.repository;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.User;

public interface UserRepository extends CrudRepository<User, Long>  {

	public Optional<User> findByLoginAndMdp(String login, String mdp);
	//@Query(value = "SELECT u FROM User u WHERE u.login =?1 AND u.mdp=?2")
	
	
}
