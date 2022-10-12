package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.*;

public interface MemoRepository extends CrudRepository<Memo, Long> {
	public Optional<Memo> findByIdMemo(Long idMemo);
	
	public List<Memo> findByExpediteurId (Long id);
	
}
