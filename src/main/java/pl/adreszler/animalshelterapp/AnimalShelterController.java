package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
class AnimalShelterController {

    private final AnimalRepository animalRepository;

    public AnimalShelterController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    String home(@RequestParam(required = false) String category,
                Model model) {
        model.addAttribute("categories", Category.values());
        if (animalRepository.findAll().isEmpty()) {
            return "index";
        }

        if (category != null) {
            Optional<Category> categoryOptional = Category.fromNameEn(category);
            categoryOptional.ifPresent(cat -> {
                model.addAttribute("animals", animalRepository.findByCategory(cat));
                model.addAttribute("category", cat);
            });
        } else {
            model.addAttribute("animals", animalRepository.findAll());
        }

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
        model.addAttribute("categories", Category.values());
        return "add-animal";
    }

    @GetMapping("/not-found")
    String notFound() {
        return "error";
    }
}
