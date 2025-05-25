package com.flashcards.repository;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.flashcards.exceptions.DeckVacioException;
import com.flashcards.exceptions.ArchivoNoEncontradoException;
import com.flashcards.model.Deck;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("json") //Esto se activa cuando el perfil esta en JSON

public class RepositorioDeDecksJson implements IRepositorioDeDecks {
    private final String jsonFilePath;
    private final ObjectMapper objectMapper;

    public RepositorioDeDecksJson(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
        this.objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public List<Deck> getDecks() {
        try {
            File file = new File(jsonFilePath);
            if (!file.exists()) {
                throw new ArchivoNoEncontradoException("El archivo JSON no existe");
            }

            // Leer el archivo JSON y convertirlo a un objeto que contiene la lista de Decks
            JsonNode rootNode = objectMapper.readTree(file);
            JsonNode decksNode = rootNode.get("decks");
            
            if (decksNode == null || !decksNode.isArray()) {
                throw new DeckVacioException("El archivo JSON no contiene ningún deck");
            }

            // Convertir cada nodo del array a un Deck
            List<Deck> decks = new ArrayList<>();
            for (JsonNode deckNode : decksNode) {
                Deck deck = objectMapper.treeToValue(deckNode, Deck.class);
                decks.add(deck);
            }

            return decks;

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public Deck getDeckById(int id) {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeckById'");
    }



    @Override
    public void addDeck(Deck deck) {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDeck'");
    }

    @Override
    public void updateDeck(Deck deck) {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDeck'");
    }

    @Override
    public void updateDeckById(int id, Deck deck) {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDeckById'");
    }

    @Override
    public void deleteDeck(Deck deck) {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDeck'");
    }

    @Override
    public void deleteDeckById(int id) {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDeckById'");
    }
    
}
