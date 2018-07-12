package rpn.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RpnStringCalculatorTest {
	
	@Test
	public void testPlus() {
		//given
		String calculation = "1 2 +";
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		
		//then
		assertEquals(3, result);
	}
	
	@Test
	public void testPlusAndMinus() {
		//given
		String calculation = "3 4 + 1 -";
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		//then
		assertEquals(6, result);
	}
	
	@Test
	public void testPlusAndDivide() {
		//given
		String calculation = "4 6 + 2 /";
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		
		//then
		assertEquals(5, result);
	}

	@Test
	public void testMultiplyAndMinus() {
		//given
		String calculation = "5 6 * 7 -";
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		
		//then
		assertEquals(23, result);
	}

	@Test
	public void testMinusAndMultiply() {
		//given
		String calculation = "4 1 - 5 *";
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		
		//then
		assertEquals(15, result);
	}
	
	@Test
	public void testDivideAndMultiply() {
		//given
		String calculation = "12 3 / 2 *";
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		
		//then
		assertEquals(8, result);
	}
	
	@Test
	public void testComplex() {

		//The infix expression ((15 ÷ (7 − (1 + 1))) × 3) − (2 + (1 + 1)) can be written like this in reverse Polish notation:
		//15 7 1 1 + - / 3 * 2 1 1 + + -
		//Wikipedia says also that result should be 5
		
		//given
		String calculation = "15 7 1 1 + - / 3 * 2 1 1 + + -";;
		RpnStringCalculator strCalc= new RpnStringCalculator(calculation);
		
		//when
		int result = strCalc.calculate();
		
		//then
		assertEquals(5, result);
	}

}
