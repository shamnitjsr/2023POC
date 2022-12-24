package in.shambhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(Application.class, args);
	
		System.out.println(Context.getClass().getName());
		System.out.println("Beans Loaded :::" +Context.getBeanDefinitionCount());
	}

}
