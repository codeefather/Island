package com.javarush.mogutov.entities.animals.predators;

// ОРЁЛ

import com.javarush.mogutov.entities.animals.herbivores.Herbivore;

public class Eagle extends Predator {
    public Eagle(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
