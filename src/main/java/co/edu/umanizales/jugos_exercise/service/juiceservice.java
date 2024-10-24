package co.edu.umanizales.jugos_exercise.service;


import co.edu.umanizales.jugos_exercise.models.Juice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class juiceservice {

    
    private List<Juice> juices = new ArrayList<>();

    
    public juiceservice() {
        juices.add(new Juice("Tropical Mix", List.of("Pineapple", "Mango", "Banana"), false, true));
        juices.add(new Juice("Berry Delight", List.of("Strawberry", "Blueberry", "Raspberry"), true, false));
        juices.add(new Juice("Citrus Blast", List.of("Orange", "Lemon"), false, true));
        juices.add(new Juice("Mango Smoothie", List.of("Mango"), true, true));
    }

    
    public List<Juice> getAllJuices() {
        return juices;
    }

    
    public List<Juice> getJuicesByFruit(String fruit) {
        return juices.stream()
                .filter(juice -> juice.getFruits().contains(fruit))
                .collect(Collectors.toList());
    }
}
