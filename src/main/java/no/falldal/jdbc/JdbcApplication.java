package no.falldal.jdbc;

import no.falldal.jdbc.model.Part;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import no.falldal.jdbc.repository.PartRepository;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PartRepository parts) {
		return  args -> {
			parts.save(new Part("cog", 5));
			parts.save(new Part("goc", 10));
		};
	}

}
