package in.shmabhu.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Customer {
	
	@Id
	private String id;
	
	private String name;
	
	private String role;
	
	private Integer age;

}
