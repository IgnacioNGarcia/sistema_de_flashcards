package com.flashcards.repository;
import com.flashcards.model.Flashcard;
import java.util.List;

public interface IRepositorioDeCards {
    List<Flashcard> getCards(String deckId);
    void updateCard(Flashcard card);
    void deleteCard(Flashcard card);
} 