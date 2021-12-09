package animals;

import aviary.AviarySize;
import food.Food;
import foodException.WrongFoodException;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int age;
    protected String color;
    protected int satiety;
    protected AviarySize size;

    public abstract void eat(Food food) throws WrongFoodException;

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

    public AviarySize getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        if (this.getClass() == obj.getClass())
            return this.name == ((Animal) obj).name;

        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
