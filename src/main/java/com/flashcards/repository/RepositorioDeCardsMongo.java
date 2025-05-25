package com.flashcards.repository;
import com.flashcards.model.Flashcard;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo") // Esto se activa cuando el perfil esta en Mongo

public class RepositorioDeCardsMongo implements IRepositorioDeCards {
    @Autowired
    private IMongoCardRepo mongoCardRepo;

    @Override
    public List<Flashcard> getCards(String deckId) {
        return mongoCardRepo.findByDeckId(deckId);
    }

    @Override
    public void updateCard(Flashcard card) {
        mongoCardRepo.save(card); // Inserta o actualiza según el id
    }

    @Override
    public void deleteCard(Flashcard card) {
        mongoCardRepo.delete(card);
    }
}
