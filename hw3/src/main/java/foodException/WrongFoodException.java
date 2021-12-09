package foodException;

public class WrongFoodException extends Exception {
    public WrongFoodException() {
        super("The food is not suitable for the animal!");
    }
}
