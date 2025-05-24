package com.flashcards.model;

import java.time.LocalDateTime;
//import com.flashcards.strategy.EstrategiaDeRepeticion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flashcard {
    private int id;
    private String front;
    private String back;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String estrategiaDeRepeticion; //Esto va a haber que cambiarlo por una interfaz de estrategia de repeticion
    private LocalDateTime fechaDeUltimaRevision;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
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