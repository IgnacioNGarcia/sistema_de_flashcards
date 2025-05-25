package com.flashcards.repository;
import com.flashcards.model.Deck;
import org.springframework.data.mongodb.repository.MongoRepository;
// Como no puedo implementarla por que MongoDeckRepo es una interfaz de Spring
// que se inyecta, no se implemetna manualmente.
// Para que no me quede la interfaz inyectada en la clases RepositorioDeCardsMongo
// y en RepositorioDeDecksMongo. La defino aca y queda inyectada.

public interface IMongoDeckRepo extends MongoRepository<Deck, String> {
}
