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
    protected int satiety = 0;
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

    public abstract void addSatiety();

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

        if (obj.getClass() == this.getClass())
            return true;

        return this.name == ((Animal) obj).name;
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
