package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Events;
import fr.solutec.repository.EventsRepository;

@RestController
@CrossOrigin("*") // n'importe qui peut consommer des api de cette classe
public class EventsRest {
@Autowired
private EventsRepository eventsRepos;


@PostMapping("event")
public Events createEvent(@RequestBody Events ev) {
	return eventsRepos.save(ev);
}
}
