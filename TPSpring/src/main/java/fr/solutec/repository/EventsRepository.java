package fr.solutec.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Events;

public interface EventsRepository extends CrudRepository<Events, Long> {

	public Optional<Events> findByStartDateAfter(Date d);

	public Optional<Events> findByStartDateBefore(Date d);
}
