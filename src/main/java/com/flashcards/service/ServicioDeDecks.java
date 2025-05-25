package com.flashcards.service;

import java.util.List;

import com.flashcards.model.Deck;
import com.flashcards.repository.IRepositorioDeDecks;

public class ServicioDeDecks {
    private  IRepositorioDeDecks repositorioDeDecks;

    public ServicioDeDecks(IRepositorioDeDecks repositorioDeDecks) {
        this.repositorioDeDecks = repositorioDeDecks;
    }
    public void setRepositorioDeDecks(IRepositorioDeDecks repositorioDeDecks) {
        this.repositorioDeDecks = repositorioDeDecks;
    }

    public List<Deck> getDecks() {
        return repositorioDeDecks.getDecks();
    }

    public Deck getDeckById(String id) {
        return repositorioDeDecks.getDeckById(id);
    }

    public void updateDeck(Deck deck) {
        repositorioDeDecks.updateDeck(deck);
    }


    public void addDeck(Deck deck) {
        repositorioDeDecks.addDeck(deck);
    }
    
    public void updateDeckById(String id, Deck deck) {
        repositorioDeDecks.updateDeckById(id, deck);
    }

    public void deleteDeck(Deck deck) {
        repositorioDeDecks.deleteDeck(deck);
    }
    
    public void deleteDeckById(String id) {
        repositorioDeDecks.deleteDeckById(id);
    }
    
}
