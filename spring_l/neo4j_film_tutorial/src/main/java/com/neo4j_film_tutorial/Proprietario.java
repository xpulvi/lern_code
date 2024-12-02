package com.neo4j_film_tutorial;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node("Proprietario")
public class Proprietario {


    @Id
    private Long idProprietario;

    @Property("name")
    private String name;

    @Relationship(type = "WRITTEN_BY", direction = Relationship.Direction.INCOMING)
    private List<Product> products;

    public Proprietario(){}

    public Proprietario(Long idProprietario, String name, List<Product> products) {
        this.idProprietario = idProprietario;
        this.name = name;
        this.products = products;
    }

    public Long getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Long idProprietario) {
        this.idProprietario = idProprietario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
