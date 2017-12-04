import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    private  double expected;
    private double valueOne;
    private double valueTwo;

    @Parameters
    public static Collection<Integer []> getTestParameters() {
        return Arrays.asList(new Integer[][]{
                {3, 2, 1},
                {4, 3, 1},
                {5, 2, 3}
        });
    }

    public ParameterizedTest(double expected, double valueOne, double valueTwo) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(expected, c.add(valueOne, valueTwo), 0);
    }
}
