package in.shmabhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.shmabhu.domain.Customer;
import in.shmabhu.service.CustomerService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers/{name}")
	public List<Customer> getCustomerByName(@PathVariable String name){
		
		log.info("Getting Customer By Name {}" , name);
		List customerList = customerService.getCustomerByName(name);
		log.info("Received {} customers By Name {}" ,customerList.size(), name);
		return customerList;
		
	}
}
