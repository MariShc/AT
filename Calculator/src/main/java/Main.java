import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        Object a = getNumber("a");
        Object b = getNumber("b");
        Object c_sum = calculator.sum(a, b);
        Object c_sub = calculator.sub(a, b);
        Object c_mult = calculator.multiply(a, b);
        Object c_dev = calculator.divide(a, b);

        System.out.println("Сумма: " + c_sum);
        System.out.println("Вычитание: " + c_sub);
        System.out.println("Умножение: " + c_mult);
        System.out.println("Деление: " + c_dev);

        in.close();
    }

    public static double getNumber(String n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число " + n + ":");
        Double num;
        if (!scanner.hasNextDouble()) {
            System.out.println("Вы ввели не число! Попробуйте еще раз.");
            scanner.next();
            num = getNumber(n);
        } else
            num = scanner.nextDouble();
        return num;
    }
}
