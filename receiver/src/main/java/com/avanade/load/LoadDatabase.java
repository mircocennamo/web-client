package com.avanade.load;


import com.avanade.model.Student;
import com.avanade.repository.StudentJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Autowired
	StudentJpaRepository studentJpaRepository;

	@Bean
	CommandLineRunner initDatabase() {


		Student pippo = new Student("Pippo","12345" );
		Student pluto = new Student("Pluto","8765" );

		return args -> {
			log.info("Preloading " + studentJpaRepository.save(pippo));
			log.info("Preloading " + studentJpaRepository.save(pluto));
		};
	}
}
