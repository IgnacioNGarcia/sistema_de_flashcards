package com.flashcards.repository;
import com.flashcards.model.Deck;
import org.springframework.data.mongodb.repository.MongoRepository;
// Como no puedo implementarla porque MongoDeckRepo es una interfaz de Spring
// que se inyecta, no se implemetna manualmente.
// Para que no me quede la interfaz inyectada en las clases RepositorioDeCardsMongo
// y en RepositorioDeDecksMongo. La defino aca y queda inyectada.

// Esto no es una interface definida, es una interface inyectada.
// Que va a usar solo la parte de mongo
public interface IMongoDeckRepo extends MongoRepository<Deck, String> {
}
