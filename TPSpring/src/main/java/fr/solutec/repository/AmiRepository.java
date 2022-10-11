package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Ami;

public interface AmiRepository extends CrudRepository<Ami, Long> {

}
