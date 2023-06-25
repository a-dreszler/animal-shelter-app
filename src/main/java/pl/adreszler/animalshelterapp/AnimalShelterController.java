package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;

@Controller
class AnimalShelterController {

    private final AnimalRepository animalRepository;

    public AnimalShelterController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    String home(@RequestParam(required = false) Category category,
                @RequestParam(required = false) boolean sort,
                Model model) {
        List<Animal> animals;
        if (category != null) {
            model.addAttribute("category", category);
            animals = animalRepository.findByCategory(category);
        } else {
            animals = animalRepository.findAll();
        }

        if (sort) {
            animals = animals.stream()
                    .sorted(Comparator.comparing(Animal::getName))
                    .toList();
        }
        model.addAttribute("animals", animals);

        return "index";
    }

    @GetMapping("/animal")
    String animal(@RequestParam Integer id, Model model) {
        Animal animal = animalRepository.getAnimalById(id);
        if (animal == null) {
            return "redirect:/not-found";
        }
        model.addAttribute("animal", animal);

        return "animal";
    }

    @GetMapping("/add-animal")
    String addAnimal(Model model) {
        model.addAttribute("animal", new Animal());
        model.addAttribute("mode", "add");
        return "edit-or-add-animal";
    }

    @PostMapping("/save-animal")
    String saveAnimal(Animal animal) {
        int id = animalRepository.addAnimalAndReturnId(animal);
        return "redirect:/animal?id=" + id;
    }

    @GetMapping("/edit")
    String editAnimal(@RequestParam Integer id, Model model) {
        Animal animal = animalRepository.getAnimalById(id);

        if (animal == null) {
            return "redirect:/not-found";
        }

        model.addAttribute("mode", "edit");
        model.addAttribute("animal", animal);

        return "edit-or-add-animal";
    }

    @PostMapping("/edit")
    String saveEditedAnimal(Animal animal) {
        animalRepository.addEditedAnimal(animal);
        return "redirect:/animal?id=" + animal.getId();
    }

    @GetMapping("/not-found")
    String notFound() {
        return "error";
    }
}