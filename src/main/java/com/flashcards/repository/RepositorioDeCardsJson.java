package com.flashcards.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.databind.JsonNode;
import com.flashcards.model.Flashcard;

public class RepositorioDeCardsJson implements IRepositorioDeCards {
    private final String jsonFilePath;
    private final ObjectMapper objectMapper;

    public RepositorioDeCardsJson(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
        this.objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public List<Flashcard> getCards(int deckId) {
        try {
            File file = new File(jsonFilePath);
            if (!file.exists()) {
                return new ArrayList<>();
            }

            // Leer el archivo JSON y convertirlo a un objeto que contiene la lista de Flashcards
            JsonNode rootNode = objectMapper.readTree(file);
            JsonNode cardsNode = rootNode.get("cards");
            
            if (cardsNode == null || !cardsNode.isArray()) {
                return new ArrayList<>();
                //Pasar a tirar una excepction despues
            }

            // Convertir cada nodo del array a una Flashcard y filtrar por deckId
            List<Flashcard> filteredCards = new ArrayList<>();
            for (JsonNode cardNode : cardsNode) {
                int cardDeckId = cardNode.get("deckId").asInt();
                if (cardDeckId == deckId) { // Esto es para solo transformar en flashcards a las que son del deckId que le pasamos, no todas alpedo.
                    Flashcard card = objectMapper.treeToValue(cardNode, Flashcard.class);
                    filteredCards.add(card);
                }
            }

            return filteredCards;

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void updateCard(Flashcard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCard'");
    }

    @Override
    public void deleteCard(Flashcard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCard'");
    }
}