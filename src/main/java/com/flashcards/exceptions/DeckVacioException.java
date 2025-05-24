package com.flashcards.exceptions;

public class DeckVacioException extends RuntimeException {
    public DeckVacioException(String message) {
        super(message);
    }
}
