package com.neo4j_film_tutorial;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Node("Product")
public class Product {

    @Id
    @GeneratedValue
    private Long idProduct;

    private String nameProduct;
    private String descrizione;

    private Optional<LocalDateTime> dataScadenza;
    private Optional<LocalDateTime> inScadenza;
    private LocalDateTime dataAcquisto;
    private int quantita;
    private boolean disponibile;
    private Optional<Boolean> scaduto;
    @Relationship(type = "WRITTEN_BY", direction = Relationship.Direction.OUTGOING)
    private List<Proprietario> proprietarios;

    public Product(){}

    public Product(Long idProduct, String nameProduct, String descrizione,
                   Optional<LocalDateTime> dataScadenza, Optional<LocalDateTime> inScadenza,
                   LocalDateTime dataAcquisto, int quantita, boolean disponibile,
                   Optional<Boolean> scaduto, List<Proprietario> proprietarios) {

        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descrizione = descrizione;
        this.dataScadenza = dataScadenza;
        this.inScadenza = inScadenza;
        this.dataAcquisto = dataAcquisto;
        this.quantita = quantita;
        this.disponibile = disponibile;
        this.scaduto = scaduto;
        this.proprietarios = proprietarios;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Optional<LocalDateTime> getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Optional<LocalDateTime> dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public Optional<LocalDateTime> getInScadenza() {
        return inScadenza;
    }

    public void setInScadenza(Optional<LocalDateTime> inScadenza) {
        this.inScadenza = inScadenza;
    }

    public LocalDateTime getDataAcquisto() {
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDateTime dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public Optional<Boolean> getScaduto() {
        return scaduto;
    }

    public void setScaduto(Optional<Boolean> scaduto) {
        this.scaduto = scaduto;
    }

    public List<Proprietario> getProprietarios() {
        return proprietarios;
    }

    public void setProprietarios(List<Proprietario> proprietarios) {
        this.proprietarios = proprietarios;
    }
}
