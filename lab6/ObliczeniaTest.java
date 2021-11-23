import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class ObliczeniaTest {
    public ObliczeniaTest() {
        System.out.print("(1)");
    }
    @Test
    public void testSetABC() {
        System.out.print("(testujemy Obliczenia.setABC)");
        String expectedResult = "f(x)=1.0x^2+1.0x+1.0";
        assertEquals(expectedResult, Obliczenia.setABC(1, 1, 1));
    }
    @Test
    public void testSetABC1() {
        System.out.print("(testujemy Obliczenia.setABC)");
        String expectedResult = "f(x)=2.0x^2+2.0x+2.0";
        assertEquals(expectedResult, Obliczenia.setABC(2, 2, 2));
    }
    @Test
    public void testGetAtX() {
        System.out.print("(testujemy Obliczenia.getAtX)");
        double expectedResult = 3.0;
        assertEquals(expectedResult, Obliczenia.getAtX(1), 0.1);
    }
    @Test
    public void testGetAtX1() {
        System.out.print("(testujemy Obliczenia.getAtX)");
        double expectedResult = 7.0;
        assertEquals(expectedResult, Obliczenia.getAtX(2), 0.1);
    }
    @Test
    public void testIntegral() {
        System.out.print("(testujemy Obliczenia.setABC)");
        double expectedResult = 7.8333;
        assertEquals(expectedResult, Obliczenia.integral(1, 2), 0.1);
    }
    @Test
    public void testIntegral1() {
        System.out.print("(testujemy Obliczenia.setABC)");
        double expectedResult = 17.8333;
        assertEquals(expectedResult, Obliczenia.integral(2, 3), 0.1);
    }
    @Test
    public void testIntegral2() {
        System.out.print("(testujemy Obliczenia.setABC)");
        double expectedResult = 31.8333;
        assertEquals(expectedResult, Obliczenia.integral(3, 4), 0.1);
    }
    @Test
    public void testIntegral3() {
        System.out.print("(testujemy Obliczenia.setABC)");
        double expectedResult = 49.8333;
        assertEquals(expectedResult, Obliczenia.integral(4, 5), 0.1);
    }
}