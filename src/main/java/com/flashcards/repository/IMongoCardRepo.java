package com.flashcards.repository;
import com.flashcards.model.Flashcard;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
// Como no puedo implementarla por que MongoDeckRepo es una interfaz de Spring
// que se inyecta, no se implemetna manualmente.
// Para que no me quede la interfaz inyectada en la clases RepositorioDeCardsMongo
// y en RepositorioDeDecksMongo. La defino aca y queda inyectada.

// Aca hay que aclarar que agrego este metodo findByDeckId, sin implementarlo
// desde la interface inyectada, gracias a el naming de Spring, que me permite
// usando un nombre descriptivo que este entinda como tiene que hacer la query.
public interface IMongoCardRepo extends MongoRepository<Flashcard, String>{
    public List<Flashcard> findByDeckId(String deckId);
}
