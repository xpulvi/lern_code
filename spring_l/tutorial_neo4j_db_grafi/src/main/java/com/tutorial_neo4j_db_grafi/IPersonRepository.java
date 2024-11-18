package com.tutorial_neo4j_db_grafi;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface IPersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);

}
