package com.javarush.mogutov.entities;

public abstract class Organism {
    private String name;
    private String pictures;
    private int weight;
    private int maxCount;
    private int maxSpeed;
    private int maxFoodToEat;

    public Organism(String name, String pictures, int weight, int maxCount, int maxSpeed, int maxFoodToEat) {
        this.name = name;
        this.pictures = pictures;
        this.weight = weight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.maxFoodToEat = maxFoodToEat;
    }
}
