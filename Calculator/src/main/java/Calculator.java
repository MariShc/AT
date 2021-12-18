public class Calculator {

    public Object sum(Object a, Object b) {
        return Double.parseDouble(String.valueOf(a)) + Double.parseDouble(String.valueOf(b));
    }

    public Object sub(Object a, Object b) {
        return Double.parseDouble(String.valueOf(a)) - Double.parseDouble(String.valueOf(b));
    }

    public Object multiply(Object a, Object b) {
        return Double.parseDouble(String.valueOf(a)) * Double.parseDouble(String.valueOf(b));
    }

    public Object divide(Object a, Object b) {
        if (Double.parseDouble(String.valueOf(b)) == 0)
            return "Divide by 0";
        return Double.parseDouble(String.valueOf(a)) / Double.parseDouble(String.valueOf(b));
    }
}
