package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
class AnimalRepository {

    private final Map<Integer, Animal> animals = new HashMap<>();
    private int nextId = 1;

    public AnimalRepository() {
        addAnimal("Lucky", "Test description 1");
        addAnimal("Billy", "Test description 2");
        addAnimal("Killer", "Test description 3");
    }

    void addAnimal(String name, String description) {
        animals.put(nextId, new Animal(nextId, name, description));
        nextId++;
    }

    Animal getAnimalById(Integer id) {
        return animals.get(id);
    }

    Collection<Animal> findAll() {
        return animals.values();
    }
}
