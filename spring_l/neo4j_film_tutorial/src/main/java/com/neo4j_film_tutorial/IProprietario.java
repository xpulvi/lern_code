package com.neo4j_film_tutorial;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProprietario extends Neo4jRepository<Proprietario, Long> {
    @Query("MATCH (b:Book)-[:WRITTEN_BY]->(a:Author) WHERE a.name = $name AND b.year > $year RETURN b")
    List<Product> findBooksAfterYear(@Param("name") String name, @Param("year") Integer year);
}
