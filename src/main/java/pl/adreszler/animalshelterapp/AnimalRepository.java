package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
class AnimalRepository {

    private final Map<String, Animal> animals = new HashMap<>();

    public AnimalRepository() {
        Animal animal1 = new Animal("Lucky", "Test description 1");
        Animal animal2 = new Animal("Billy", "Test description 2");
        Animal animal3 = new Animal("Killer", "Test description 3");

        animals.put(animal1.getName(), animal1);
        animals.put(animal2.getName(), animal2);
        animals.put(animal3.getName(), animal3);
    }

    Optional<Animal> getAnimalByName(String name) {
        return Optional.ofNullable(animals.get(name));
    }

    Collection<Animal> findAll() {
        return animals.values();
    }
}
