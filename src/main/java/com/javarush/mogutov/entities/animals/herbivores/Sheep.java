package com.javarush.mogutov.entities.animals.herbivores;

import com.javarush.mogutov.entities.animals.Animal;

// Овца

public class Sheep extends Herbivore {
    public Sheep(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
