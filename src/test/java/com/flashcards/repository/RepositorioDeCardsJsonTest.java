package com.flashcards.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import com.flashcards.model.Flashcard;

class RepositorioDeCardsJsonTest {

    private RepositorioDeCardsJson repositorio;
    private String testJsonPath;

    @BeforeEach
    void setUp() throws Exception {
        testJsonPath = new ClassPathResource("cards.json").getFile().getAbsolutePath();
        repositorio = new RepositorioDeCardsJson(testJsonPath);
    }

    @Test
    void testGetCardsDeck1() {
        List<Flashcard> cards = repositorio.getCards(1);

        assertEquals(3, cards.size());

        /*
        
        // Verificar que las cards son las correctas
        Flashcard card1 = cards.get(0);
        assertEquals(1, card1.getId());
        assertEquals("Test Card 1", card1.getFront());
        assertEquals("Answer 1", card1.getBack());
        assertEquals(1, card1.getDeckId());

        Flashcard card2 = cards.get(1);
        assertEquals(2, card2.getId());
        assertEquals("Test Card 2", card2.getFront());
        assertEquals("Answer 2", card2.getBack());
        assertEquals(1, card2.getDeckId());
        */
    }

} 