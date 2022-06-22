package com.javarush.mogutov.entities.animals.predators;

import com.javarush.mogutov.entities.animals.Animal;

public class Predator extends Animal {
    public Predator(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
