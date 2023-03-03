package my;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testFunctionY() {
        double expected = 8.173;
        double result = main.functionY(2.7, -0.3, 4, 1.3);
        assertEquals(expected, result, 1e-3);
    }


    @ParameterizedTest
    @CsvSource({
            "3,0,1,0.5",
            "101,-3,7,0.1"
    })
    void testCount(int a, double begin, double end, double h) {
        double result = main.count(begin, end, h);
        assertEquals(a, result, 1e-7);

    }

    @Test
    void testCreateArrayX() {
        double[] expected = {0, 0.5, 1};
        double[] result = main.createArrayX(0, 1, 0.5);
        assertArrayEquals(expected, result, 1e-7);
    }

    @Test
    void testCreateArrayX0() {
        double expected = 0;
        double[] x = main.createArrayX(0, 2, 0.002);
        double result = x[0];
        assertEquals(expected, result, 1e-7);
    }

    @Test
    void testCreateArrayX700() {
        double expected = 1.4000000;
        double[] x = main.createArrayX(0, 2, 0.002);
        double result = x[700];
        assertEquals(expected, result, 1e-7);
    }

    @Test
    void testCreateArrayX1000() {
        double expected = 2;
        double[] x = main.createArrayX(0, 2, 0.002);
        double result = x[1000];
        assertEquals(expected, result, 1e-7);
    }
    @Test
    void testCreateArrayY0() {
        double expected = 4;
        double[] x = main.createArrayX(0,2,0.002);
        double[] y = main.createArrayY(2.7,-0.3,4,x);
        double result = y[0];
        assertEquals(expected,result,1e-7);
    }
    @Test
    void testCreateArrayY700() {
        double expected = 3.64903648;
        double[] x = main.createArrayX(0,2,0.002);
        double[] y = main.createArrayY(2.7,-0.3,4,x);
        double result = y[700];
        assertEquals(expected,result,1e-7);
    }
    @Test
    void testCreateArrayY1000() {
        double expected = 0.939148551;
        double[] x = main.createArrayX(0,2,0.002);
        double[] y = main.createArrayY(2.7,-0.3,4,x);
        double result = y[1000];
        assertEquals(expected,result,1e-7);
    }
    @Test
    void testSumY() {
        double expected = 6.804;
        double[] y = {-0.2,5,0.004,2};
        double result = main.sumY(y);
        assertEquals(expected,result,1e-7);
    }
    @Test
    void testAverageY() {
        double expected = 1.701;
        double[] y = {-0.2,5,0.004,2};
        double result = main.averageY(y);
        assertEquals(expected,result,1e-7);
    }
}