package com.flashcards.controller;
import com.flashcards.model.Deck;
import com.flashcards.repository.IRepositorioDeDecks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/flashcards")
//http://localhost:8080/api/flashcards/

public class FlashcardController {
    @GetMapping("/")
    public String hola() {
        return "¡Hola, mundo! desde flashcards controller ";
    }
}
