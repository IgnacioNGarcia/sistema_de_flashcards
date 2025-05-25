package com.flashcards.repository;
import com.flashcards.model.Flashcard;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo") // Esto se activa cuando el perfil esta en Mongo

public class RepositorioDeCardsMongo implements IRepositorioDeCards {
    @Override
    public List<Flashcard> getCards(int deckId) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCards'");
    }

    @Override
    public void updateCard(Flashcard card) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCard'");
    }

    @Override
    public void deleteCard(Flashcard card) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCard'");
    }
}
