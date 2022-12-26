package in.shmabhu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import in.shmabhu.domain.Customer;
import in.shmabhu.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getCustomerByName(String name){
		
		log.info("Getting Customer {} from the Repository");
		
		List<Customer> customerList = customerRepository.findByName(name);
		
		if(CollectionUtils.isEmpty(customerList)) {
			log.info("No Customer found By name {}", name);
			return new ArrayList<Customer>();
		}
		log.info("found {} customers by name {}" , customerList.size(),name);
		return customerList;
		
	}

}
