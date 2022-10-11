package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.solutec.entities.UserEvent;
import fr.solutec.repository.UserEventsRepository;

public class UserEventsRest {
	@Autowired
	private UserEventsRepository usereventsRepos;

}
