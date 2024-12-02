package com.neo4j_film_tutorial;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Product", path = "Product")
public interface IProductRepository extends Neo4jRepository <Product, Long> {
    Product findOneByName(String nameProduct);
    List<Product> findByScadenza(LocalDateTime scadenzaData);
}
