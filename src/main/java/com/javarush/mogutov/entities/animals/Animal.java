package com.javarush.mogutov.entities.animals;

import com.javarush.mogutov.entities.Organism;

public abstract class Animal extends Organism {
    public Animal(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat){
        super(name, pictures, weight, maxCount, maxSpeed, maxFoodToEat);
    }
}
