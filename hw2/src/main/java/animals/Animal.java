package animals;

import food.Food;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int age;
    protected String color;
    protected int satiety = 0;

    public abstract boolean eat(Food food);

    public abstract String getName();

    public abstract double getWeight();

    public abstract int getAge();

    public abstract String getColor();

    public abstract String typeAnimal();

    public abstract void addSatiety();
}
