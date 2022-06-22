package com.javarush.mogutov.entities.animals.herbivores;

import com.javarush.mogutov.entities.animals.Animal;

// лошадь
public class Horse extends Herbivore {
    public Horse(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
