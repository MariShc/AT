public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public Object divide(double a, double b) {
        if (Double.parseDouble(String.valueOf(b)) == 0)
            return "Divide by 0";
        return a / b;
    }
}
