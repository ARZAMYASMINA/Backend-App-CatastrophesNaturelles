package a.fstt.catastrophes_naturelles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "a.fstt.catastrophes_naturelles.persistence")
public class CatastrophesNaturellesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatastrophesNaturellesApplication.class, args);
	}

}
