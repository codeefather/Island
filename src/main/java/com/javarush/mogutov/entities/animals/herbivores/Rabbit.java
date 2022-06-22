package com.javarush.mogutov.entities.animals.herbivores;

import com.javarush.mogutov.entities.animals.Animal;

// кролик
public class Rabbit extends Herbivore {
    public Rabbit(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
