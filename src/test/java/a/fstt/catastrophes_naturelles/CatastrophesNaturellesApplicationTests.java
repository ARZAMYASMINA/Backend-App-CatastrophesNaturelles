package a.fstt.catastrophes_naturelles;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "a.fstt.catastrophes_naturelles.persistence")
@EnableJpaRepositories(basePackages = "a.fstt.catastrophes_naturelles.repository")
@ComponentScan(basePackages = "a.fstt.catastrophes_naturelles.Services")
class CatastrophesNaturellesApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(CatastrophesNaturellesApplicationTests.class, args);

	}
}