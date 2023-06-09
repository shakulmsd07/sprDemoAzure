package sprDemoAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprDemoAzureApplication {

	@GetMapping("/message")
	public String message() {
		
		return "congrats your application running successfully";
	}
	public static void main(String[] args) {
		SpringApplication.run(SprDemoAzureApplication.class, args);
	}

}
