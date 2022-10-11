package fr.solutec.rest;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import fr.solutec.entities.Events;
import fr.solutec.entities.UserEvent;
import fr.solutec.repository.UserEventsRepository;

public class UserEventsRest {
	@Autowired
	private UserEventsRepository usereventsRepos;
	
	@DeleteMapping("request/delete/{id}")
	public Boolean deleteRequest(@PathVariable Long id) {
		Optional<UserEvent> ue = usereventsRepos.findById(id);
		if(!ue.get().isDemandeAcceptee()) {
			usereventsRepos.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	@PutMapping("request/accept/{id}")
	public Boolean acceptRequest(@PathVariable Long id) {
		Optional <UserEvent> ue = usereventsRepos.findById(id);
			if(!ue.get().isDemandeAcceptee()) {
				ue.get().setDemandeAcceptee(true);
				return true;
		} else {
				return false;
		}
	}
	
}
