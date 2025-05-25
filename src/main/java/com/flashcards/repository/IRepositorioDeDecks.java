package com.flashcards.repository;
import java.util.List;
import com.flashcards.model.Deck;

public interface IRepositorioDeDecks{
    List<Deck> getDecks();
    Deck getDeckById(String id);
    void addDeck(Deck deck);
    void updateDeck(Deck deck);
    void updateDeckById(String id, Deck deck);
    void deleteDeck(Deck deck);
    void deleteDeckById(String id);
}
