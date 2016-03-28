import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator; 
	@Before
	public void setup(){
		calculator = new Calculator();
	}
	

	

	@Test
	public void testMinus() {
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		calculator.divide(6, 0);
}
}
