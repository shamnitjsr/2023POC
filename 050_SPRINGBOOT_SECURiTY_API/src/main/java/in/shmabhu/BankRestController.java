package in.shmabhu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to SBI Bank....";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		return "Funds Transfer Initiated...!!";
	}
	
	@GetMapping("/balance")
	public String checkBalance() {
		return "Your Account balance is :: 10,000 INR";
	}
	
	@GetMapping("/about")
	public String abouts() {
		return "SBI Bank Managing by Indian Central Govt";
	}

}
