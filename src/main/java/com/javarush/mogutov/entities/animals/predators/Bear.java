package com.javarush.mogutov.entities.animals.predators;

// МЕДВЕДЬ

import com.javarush.mogutov.entities.animals.herbivores.Herbivore;

public class Bear extends Predator {
    public Bear(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat){
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
