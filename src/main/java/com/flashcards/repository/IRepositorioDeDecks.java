package com.flashcards.repository;

import java.util.List;

import com.flashcards.model.Deck;

public interface IRepositorioDeDecks {
    List<Deck> getDecks();
    Deck getDeckById(int id);
    void addDeck(Deck deck);
    void updateDeck(Deck deck);
    void updateDeckById(int id, Deck deck);
    void deleteDeck(Deck deck);
    void deleteDeckById(int id);
}
