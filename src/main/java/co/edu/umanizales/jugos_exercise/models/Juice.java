package co.edu.umanizales.jugos_exercise.models;

import java.util.List;

public class Juice {
    private String name;
    private List<String> fruits;
    private boolean withMilk;
    private boolean withSugar;

    
    public Juice(String name, List<String> fruits, boolean withMilk, boolean withSugar) {
        this.name = name;
        this.fruits = fruits;
        this.withMilk = withMilk;
        this.withSugar = withSugar;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }

    public boolean isWithSugar() {
        return withSugar;
    }

    public void setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
    }
}