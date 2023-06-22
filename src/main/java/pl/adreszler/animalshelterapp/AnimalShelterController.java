package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class AnimalShelterController {

    private final AnimalRepository animalRepository;

    public AnimalShelterController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    String home(Model model) {
        if (!animalRepository.findAll().isEmpty()) {
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

    @GetMapping("/not-found")
    String notFound() {
        return "error";
    }
}
