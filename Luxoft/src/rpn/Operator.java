package rpn;

import java.util.function.BiFunction;

public interface Operator extends BiFunction<Integer, Integer, Integer>, RpnToken{

	public static final Operator PLUS = (u, v) -> u + v; 
	public static final Operator MINUS = (u, v) -> u - v; 
	public static final Operator MULTIPLY = (u, v) -> u * v; 
	public static final Operator DIVIDE = (u, v) -> u / v; 
	
}