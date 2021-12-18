import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider
    public Object[][] testEqualsPositiveSum() {
        return new Object[][]{
                {11.8647, 8.5647, 3.3},
                {0, -356, 356},
                {-30, -10, -20},
                {-1000, 0, -1000}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeSum() {
        return new Object[][]{
                {22.444, 20.345, 2.1},
                {0, -1, -1},
                {6.41, 2.21, -4.2},
                {100, 0, 10}
        };
    }

    @DataProvider
    public Object[][] testEqualsPositiveSub() {
        return new Object[][]{
                {78.8, 85, 6.2},
                {6.2234, 10.2234, 4},
                {-190, -190, 0},
                {0.75, -6.25, -7}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeSub() {
        return new Object[][]{
                {5.5044, 5.7479, 0.2436},
                {0, -356.6, 356.6},
                {30, 50, -20},
                {-0.75, -6.25, -7}
        };
    }

    @DataProvider
    public Object[][] testEqualsPositiveMult() {
        return new Object[][]{
                {25.3944, 4.2324, 6},
                {-5.4, -2.7, 2},
                {-1000, 5, -200},
                {0, 0, 10}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeMult() {
        return new Object[][]{
                {30.4344, 4.2321, 2},
                {70, 70, 0},
                {-400, 4, 100},
                {-25, -5, -5}
        };
    }

    @DataProvider
    public Object[][] testEqualsPositiveDiv() {
        return new Object[][]{
                {1.5625, 12.5, 8},
                {0, 0, 9},
                {-8, -16, 2},
                {4.9205, 15.7456, 3.2}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeDiv() {
        return new Object[][]{
                {3.75, 5.5, 2},
                {0.8245, 4.123, 5},
                {-8, -1000, 10},
                {7, 0, 7}
        };
    }

    @DataProvider
    public Object[][] testEqualsDiv0() {
        return new Object[][]{
                {"Divide by 0", 25, 0}
        };
    }

    @Test(dataProvider = "testEqualsPositiveSum")
    public void testEqualsPositiveSum(Object a, Object b, Object c) {
        Assert.assertEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().sum(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения не равны!");
    }

    @Test(dataProvider = "testEqualsNegativeSum")
    public void testEqualsNegativeSum(Object a, Object b, Object c) {
        Assert.assertNotEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().sum(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения равны!");
    }

    @Test(dataProvider = "testEqualsPositiveSub")
    public void testEqualsPositiveSub(Object a, Object b, Object c) {
        Assert.assertEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().sub(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения не равны!");
    }

    @Test(dataProvider = "testEqualsNegativeSub")
    public void testEqualsNegativeSub(Object a, Object b, Object c) {
        Assert.assertNotEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().sub(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения равны!");
    }

    @Test(dataProvider = "testEqualsPositiveMult")
    public void testEqualsPositiveMult(Object a, Object b, Object c) {
        Assert.assertEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().multiply(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения не равны!");
    }

    @Test(dataProvider = "testEqualsNegativeMult")
    public void testEqualsNegativeMult(Object a, Object b, Object c) {
        Assert.assertNotEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().multiply(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения равны!");
    }

    @Test(dataProvider = "testEqualsPositiveDiv")
    public void testEqualsPositiveDiv(Object a, Object b, Object c) {
        Assert.assertEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().divide(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения не равны!");
    }

    @Test(dataProvider = "testEqualsNegativeDiv")
    public void testEqualsNegativeDiv(Object a, Object b, Object c) {
        Assert.assertNotEquals(Double.parseDouble(String.valueOf(a)),
                new Calculator().divide(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения равны!");
    }

    @Test(dataProvider = "testEqualsDiv0")
    public void testEqualsDiv0(Object a, Object b, Object c) {
        Assert.assertEquals(a,
                new Calculator().divide(Double.parseDouble(String.valueOf(b)),
                        Double.parseDouble(String.valueOf(c))),
                "Значения не равны!");
    }
}
