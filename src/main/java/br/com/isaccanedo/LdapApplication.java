package br.com.isaccanedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class LdapApplication implements CommandLineRunner {

	private final PersonRepository repository;

	public LdapApplication(PersonRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {

		// fetch all people
		System.out.println("People found with findAll():");
		System.out.println("-------------------------------");
		for (Person person : this.repository.findAll()) {
			System.out.println(person);
		}
		System.out.println();

		// fetch an individual person
		System.out.println("Person found with findByPhone('+46 555-123456'):");
		System.out.println("--------------------------------");
		System.out.println(this.repository.findByPhone("+46 555-123456"));
	}

	public static void main(String[] args) {
		SpringApplication.run(LdapApplication.class, args).close();
	}

}
