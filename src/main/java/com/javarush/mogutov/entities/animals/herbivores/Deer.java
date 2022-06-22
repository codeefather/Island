package com.javarush.mogutov.entities.animals.herbivores;

import com.javarush.mogutov.entities.animals.Animal;

// Олень

public class Deer extends Herbivore {
    public Deer(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
