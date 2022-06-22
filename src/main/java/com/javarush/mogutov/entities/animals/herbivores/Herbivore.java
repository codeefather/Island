package com.javarush.mogutov.entities.animals.herbivores;

import com.javarush.mogutov.entities.animals.Animal;

public class Herbivore extends Animal {
    public Herbivore(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
