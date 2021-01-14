package helloWorld;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReository<Customer, Integer> {

	
	@Query(value = "Select * from Customer", nativeQuery = true)
	Iterable<Customer> getAllCustomers();
	
	Customer findById()
	
}
