package com.flashcards.model;
import java.time.LocalDateTime;
//import com.flashcards.strategy.EstrategiaDeRepeticion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "flashcards")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Flashcard {
    @Id
    private String id;

    private String front;
    private String back;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String estrategiaDeRepeticion; //Esto vamos a tener que cambiarlo por una interfaz de estrategia de repeticion
    private LocalDateTime fechaDeUltimaRevision;
    private String deckId;

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public void setFechaDeUltimaRevision(LocalDateTime fechaDeUltimaRevision) {
        this.fechaDeUltimaRevision = fechaDeUltimaRevision;
    }

    public void setEstrategiaDeRepeticion(String estrategiaDeRepeticion) {
        this.estrategiaDeRepeticion = estrategiaDeRepeticion;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getEstrategiaDeRepeticion() {
        return estrategiaDeRepeticion;
    }

    public LocalDateTime getFechaDeUltimaRevision() {
        return fechaDeUltimaRevision;
    }
} 