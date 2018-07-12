package rpn.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RpnStringCalculator {

	private static final Pattern RPN_PATTERN = Pattern.compile("(\\d+)\\s(\\d+)\\s(\\D)");

	private String calculation;

	public RpnStringCalculator(String inputOperation) {
		this.calculation = inputOperation;
	}

	public int calculate() {

		while (calculation.contains(" ")) {
			Matcher matcher = RPN_PATTERN.matcher(calculation);
			matcher.find();

			Integer operand1 = Integer.valueOf(matcher.group(1));
			Integer operand2 = Integer.valueOf(matcher.group(2));
			String operator = matcher.group(3);

			int tmpCalc = 0;
			switch (operator) {
			case "+":
				tmpCalc = operand1 + operand2;
				break;
			case "-":
				tmpCalc = operand1 - operand2;
				break;
			case "*":
				tmpCalc = operand1 * operand2;
				break;
			case "/":
				tmpCalc = operand1 / operand2;
				break;
			}

			calculation = calculation.replace(matcher.group(0), Integer.toString(tmpCalc));
		}

		return Integer.valueOf(calculation);
	}


}
