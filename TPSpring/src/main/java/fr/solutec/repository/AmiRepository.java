package fr.solutec.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Ami;
import fr.solutec.entities.Events;

public interface AmiRepository extends CrudRepository<Ami, Long> {
	public Iterable<Ami> findAllByDemandeurOrReceveur(Long iddem, Long idrec);
}