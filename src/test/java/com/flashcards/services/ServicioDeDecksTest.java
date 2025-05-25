package com.flashcards.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import com.flashcards.model.Deck;
import com.flashcards.model.Flashcard;
import com.flashcards.repository.RepositorioDeDecksJson;
import com.flashcards.service.ServicioDeDecks;

class ServicioDeDecksTest {
    @Test
    void testGetCardsDeck1() throws IOException {
        String path = new ClassPathResource("decks.json").getFile().getAbsolutePath();
        RepositorioDeDecksJson repositorioDeDecks = new RepositorioDeDecksJson(path);
        ServicioDeDecks servicioDeDecks = new ServicioDeDecks(repositorioDeDecks);

        List<Deck> decks = servicioDeDecks.getDecks();
        assertEquals(3, decks.size());

        Deck deck1 = decks.getFirst();
        assertEquals("Flashcards sobre civilizaciones antiguas",deck1.getDescripcion());
        assertEquals("1",deck1.getId());

        List<Flashcard> flashcards = deck1.getFlashcards();
        assertEquals(2, flashcards.size());


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