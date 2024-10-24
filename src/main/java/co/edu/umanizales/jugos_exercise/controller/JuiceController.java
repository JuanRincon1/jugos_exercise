package co.edu.umanizales.jugos_exercise.controller;

import co.edu.umanizales.jugos_exercise.models.Juice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/juices")
public class JuiceController {

    private List<Juice> juices = new ArrayList<>();

    public JuiceController() {
        juices.add(new Juice("Tropical Mix", List.of("Pineapple", "Mango", "Banana"), false, true));
        juices.add(new Juice("Berry Delight", List.of("Strawberry", "Blueberry", "Raspberry"), true, false));
        juices.add(new Juice("Citrus Blast", List.of("Orange", "Lemon"), false, true));
        juices.add(new Juice("Mango Smoothie", List.of("Mango"), true, true));
    }

    
    @GetMapping
    public List<Juice> getAllJuices() {
        return juices;
    }

    
    @GetMapping("/fruit/{fruit}")
    public List<Juice> getJuicesByFruit(@PathVariable String fruit) {
        return juices.stream()
                .filter(juice -> juice.getFruits().stream().anyMatch(f -> f.equalsIgnoreCase(fruit)))
                .collect(Collectors.toList());
    }
}