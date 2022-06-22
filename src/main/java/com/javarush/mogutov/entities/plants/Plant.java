package com.javarush.mogutov.entities.plants;

import com.javarush.mogutov.entities.Organism;

public class Plant extends Organism {
    public Plant(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
