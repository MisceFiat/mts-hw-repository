package ru.mts;

public abstract class Predator extends AbstractAnimal{

    public Predator(String breed, String name, String cost, String character){
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }
    public Predator(){};

    @Override
    public void getBreed() {
        System.out.println("My breed is " + breed);
    }

    @Override
    public void getName() {
        System.out.println("My name is " + name);
    }

    @Override
    public void getCost() {
        System.out.println("My cost is " + cost);
    }

    @Override
    public void getCharacter() {
        System.out.println("My character is " + character);
    }

    public void specialAction() {
        System.out.println("I'm bite!");
    }
}
