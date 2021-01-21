package app;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRep extends CrudRepository<Students, Integer>{
	
	@Query(value = "select Students.vnaam from Students", nativeQuery = true)
	Iterable<Students> getAllStudents();

}
