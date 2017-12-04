import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
import static org.junit.runners.Suite.*;

public class CalculatorTest{
    @Test
    public void add() throws Exception {
        double result = 2.0;
        Calculator cal = new Calculator();
        assertEquals(result, cal.add(1, 1), 0);
    }

}