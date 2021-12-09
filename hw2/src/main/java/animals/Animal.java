package animals;

import food.Food;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int age;
    protected String color;
    protected int satiety;

    public abstract boolean eat(Food food);

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void addSatiety() {
        satiety += this.satiety;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}
