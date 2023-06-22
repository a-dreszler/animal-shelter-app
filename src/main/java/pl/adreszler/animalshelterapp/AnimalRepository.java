package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
class AnimalRepository {

    private final Map<Integer, Animal> animals = new HashMap<>();
    private int nextId = 1;

    public AnimalRepository() {
        addAnimal("Lucky", "Test description 1", "lucky-pic.jpg", "Labrador sitting on a meadow");
        addAnimal("Billy", "Test description 2 shdsahdhsad sed sad sa dsa d sadsad sa dsa d sadsadsadds " +
                "sdadsadsa", "billy-pic.jpg", "German shepherd laying on grass");
        addAnimal("Kitty", "Test description 3", "kitty-pic.jpg", "An orange cat");
    }

    void addAnimal(String name, String description, String pictureFileName, String pictureAlt) {
        Picture picture = new Picture(pictureFileName, pictureAlt);
        animals.put(nextId, new Animal(nextId, name, description, picture));
        nextId++;
    }

    Animal getAnimalById(Integer id) {
        return animals.get(id);
    }

    Collection<Animal> findAll() {
        return animals.values();
    }
}