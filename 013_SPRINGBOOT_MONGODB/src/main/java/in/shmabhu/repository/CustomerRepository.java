package in.shmabhu.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.shmabhu.domain.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	List<Customer> findByName(String name);
	List<Customer> findByRole(String role);

}
