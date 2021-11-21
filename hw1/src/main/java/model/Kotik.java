package model;

public class Kotik {
    private int prettiness;
    private String name;
    private String color;
    private int weight;
    private String meow;
    private int age;

    private int satiety = 10;
    private String food = "food";

    private static int countObjects = 0;

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getMeow() {
        return meow;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("I am playing. I love to play.");
            satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Zzzzz...");
            satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean chaseMouse() {
        if (satiety > 0) {
            System.out.println("It is my mouse now!");
            satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean sayMeow() {
        if (satiety > 0) {
            System.out.println(meow);
            satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean jump() {
        if (satiety > 0) {
            System.out.println("I love to jump, jump high!");
            satiety--;
            return true;
        }
        else
            return false;
    }

    public void eat(String food) {
        satiety += 10;
        System.out.println("Ate " + food + "!");
    }

    public void eat(int satiety) {
        this.satiety += satiety;
        System.out.println("Ate " + food + "!");
    }

    public void eat(int satiety, String food) {
        this.satiety += satiety;
        System.out.println("Ate " + food + "!");
    }

    public void eat(){
        eat(10, "fish");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            double result = Math.random()*4 + 1;

            if (satiety <= 0){
                System.out.println("I am hungry. Feed me!");
                eat();
            }
            else {
                switch ((int) result) {
                    case 0:
                        play();
                        break;
                    case 1:
                        sleep();
                        break;
                    case 2:
                        chaseMouse();
                        break;
                    case 3:
                        sayMeow();
                        break;
                    case 4:
                        jump();
                        break;
                }
            }
        }
    }

    public static void countKotiks() {
        System.out.println("------------------------------------");
        System.out.println(countObjects + " kotiks created");
    }

    public Kotik() {
        countObjects++;
    }

    public Kotik(int prettiness, String name, String color, int weight, String meow, int age) {
        this.prettiness = prettiness;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.meow = meow;
        this.age = age;
        countObjects++;
    }

    public void setKotik(int prettiness, String name, String color, int weight, String meow, int age) {
        this.prettiness = prettiness;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.meow = meow;
        this.age = age;
    }
}
