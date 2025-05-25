package com.flashcards.repository;
import com.flashcards.model.Deck;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
@Repository
@Profile("mongo") // Esto se activa cuando el perfil esta en Mongo

public class RepositorioDeDecksMongo implements IRepositorioDeDecks{

    @Autowired
    private IMongoDeckRepo mongoRepo;

    @Override
    public List<Deck> getDecks() {
        return mongoRepo.findAll();
    }

    @Override
    public Deck getDeckById(String id) {
        Optional<Deck> optionalDeck = mongoRepo.findById(id);
        return optionalDeck.orElse(null);
    }

    @Override
    public void addDeck(Deck deck) {
        mongoRepo.save(deck);
    }

    @Override
    public void updateDeck(Deck deck) {
        mongoRepo.save(deck); // Si el ID ya existe, lo actualiza
    }

    @Override
    public void updateDeckById(String id, Deck deck) {
        deck.setId(id); // Asegurarse de que el ID esté correctamente asignado
        mongoRepo.save(deck);
    }

    @Override
    public void deleteDeck(Deck deck) {
        mongoRepo.delete(deck);
    }

    @Override
    public void deleteDeckById(String id) {
        mongoRepo.deleteById(id);
    }
}
