package com.tutorial_neo4j_db_grafi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
public class TutorialNeo4jDbGrafiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialNeo4jDbGrafiApplication.class, args);
	}

}
