package com.flashcards.repository;
import com.flashcards.model.Deck;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo") // Esto se activa cuando el perfil esta en Mongo

public class RepositorioDeDecksMongo implements IRepositorioDeDecks{

    @Override
    public List<Deck> getDecks() {
        //  Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDecks'");
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
