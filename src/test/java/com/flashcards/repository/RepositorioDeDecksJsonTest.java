package com.flashcards.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import com.flashcards.model.Deck;
import com.flashcards.model.Flashcard;

class RepositorioDeDecksJsonTest {

    private RepositorioDeDecksJson repositorio;
    private String testJsonPath;

    @BeforeEach
    void setUp() throws Exception {
        testJsonPath = new ClassPathResource("decks.json").getFile().getAbsolutePath();
        repositorio = new RepositorioDeDecksJson(testJsonPath);
    }

    @Test
    void testGetDecks() {
        List<Deck> decks = repositorio.getDecks();
        assertEquals(3, decks.size());
        Deck deck1 = decks.getFirst();
        assertEquals("Flashcards sobre civilizaciones antiguas",deck1.getDescripcion());
        assertEquals("1",deck1.getId());

        Deck deck2 = decks.get(1);
        assertEquals("Conceptos fundamentales de matemáticas",deck2.getDescripcion());
        assertEquals("2",deck2.getId());

        Deck deck3 = decks.get(2);
        assertEquals("Capitales y países del mundo",deck3.getDescripcion());
        assertEquals("3",deck3.getId());
        
        Flashcard card1 = deck1.getFlashcards().getFirst();
        assertEquals("¿Cuál fue la primera civilización de la historia?",card1.getFront());
        assertEquals("Sumerios",card1.getBack());
        assertEquals("1",card1.getId());
        
        Flashcard card2 = deck1.getFlashcards().get(1);
        assertEquals("¿En qué año cayó el Imperio Romano de Occidente?",card2.getFront());
        assertEquals("476 d.C.",card2.getBack());
        assertEquals("2",card2.getId());
        
        


    }

} 