package java_calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import java_calculator.Representation;

public class CalculatorTest {

    @Test public void test1plus1() {
    	Representation rep = new Representation(1.0,1.0,'+');
    	double calc = Calculator.calculate(rep);
        assertEquals(2.0,calc, 0.0);

	}
	
}
