package rpn;

import static org.junit.Assert.assertEquals;
import static rpn.Operand.of;
import static rpn.Operator.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RpnCalculatorTest {
	
	@Test
	public void testPlus() {
		//given
		List<RpnToken> calculation = new ArrayList<>();
		calculation.add(of(1));
		calculation.add(of(2));
		calculation.add(PLUS);
		RpnCalculator rpnCalculator = new RpnCalculator(calculation);
		
		//when
		Operand result = rpnCalculator.calculate();
		
		//then
		assertEquals(3, result.getValue());
	}
	
	@Test
	public void testPlusAndMinus() {
		//given
		List<RpnToken> calculation = new ArrayList<>();
		calculation.add(of(3));
		calculation.add(of(4));
		calculation.add(PLUS);
		calculation.add(of(1));
		calculation.add(MINUS);
		RpnCalculator rpnCalculator = new RpnCalculator(calculation);
		
		//when
		Operand result = rpnCalculator.calculate();
		
		//then
		assertEquals(6, result.getValue());
	}
	
	@Test
	public void testPlusAndDivide() {
		//given
		List<RpnToken> calculation = new ArrayList<>();
		calculation.add(of(6));
		calculation.add(of(4));
		calculation.add(PLUS);
		calculation.add(of(2));
		calculation.add(DIVIDE);
		RpnCalculator rpnCalculator = new RpnCalculator(calculation);
		
		//when
		Operand result = rpnCalculator.calculate();
		
		//then
		assertEquals(5, result.getValue());
	}

	@Test
	public void testMultiplyAndMinus() {
		//given
		List<RpnToken> calculation = new ArrayList<>();
		calculation.add(of(5));
		calculation.add(of(6));
		calculation.add(MULTIPLY);
		calculation.add(of(7));
		calculation.add(MINUS);
		RpnCalculator rpnCalculator = new RpnCalculator(calculation);
		
		//when
		Operand result = rpnCalculator.calculate();
		
		//then
		assertEquals(23, result.getValue());
	}

	@Test
	public void testMinusAndMultiply() {
		//given
		List<RpnToken> calculation = new ArrayList<>();
		calculation.add(of(4));
		calculation.add(of(1));
		calculation.add(MINUS);
		calculation.add(of(5));
		calculation.add(MULTIPLY);
		RpnCalculator rpnCalculator = new RpnCalculator(calculation);
		
		//when
		Operand result = rpnCalculator.calculate();
		
		//then
		assertEquals(15, result.getValue());
	}
	
	@Test
	public void testComplex() {

		//The infix expression ((15 ÷ (7 − (1 + 1))) × 3) − (2 + (1 + 1)) can be written like this in reverse Polish notation:
		//15 7 1 1 + − ÷ 3 × 2 1 1 + + −
		//Wikipedia says also that result should be 5
		
		//given
		List<RpnToken> calculation = new ArrayList<>();
		calculation.add(of(15));
		calculation.add(of(7));
		calculation.add(of(1));
		calculation.add(of(1));
		calculation.add(PLUS);
		calculation.add(MINUS);
		calculation.add(DIVIDE);
		calculation.add(of(3));
		calculation.add(MULTIPLY);;
		calculation.add(of(2));
		calculation.add(of(1));
		calculation.add(of(1));
		calculation.add(PLUS);
		calculation.add(PLUS);
		calculation.add(MINUS);
		RpnCalculator rpnCalculator = new RpnCalculator(calculation);
		
		//when
		Operand result = rpnCalculator.calculate();
		
		//then
		assertEquals(5, result.getValue());
	}

}
