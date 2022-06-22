package com.javarush.mogutov.entities.animals.predators;

// ВОЛК

import com.javarush.mogutov.entities.animals.herbivores.Herbivore;

public class Wolf extends Predator {
    public Wolf(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
