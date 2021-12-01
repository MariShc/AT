import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik cat1 = new Kotik(10, "Barsik", "Black", 4, "Meow meow meooow", 5);
        Kotik cat2 = new Kotik();
        cat2.setKotik(9, "Vasya", "Gray", 3, "Meeow!", 3);
        cat1.liveAnotherDay();
        System.out.println("The first kotik: " + cat1.getName() + ", his weight: " + cat1.getWeight() + "kg");
        System.out.println("Do kotiks speak identically? - " + cat1.getMeow().equals(cat2.getMeow()));
        Kotik.countKotiks();
    }
}
