package br.com.camila.user_api;

import br.com.camila.user_api.domain.User;
import br.com.camila.user_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Zebedeu Abraão", "zebedeu@email.com", "12345", 42.00)
				//new User(null, "Maria Madalena", "maria@email.com", "12345", 35.00)
		));
	}
}
