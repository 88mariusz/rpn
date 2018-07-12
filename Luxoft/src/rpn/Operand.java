package rpn;

public class Operand implements RpnToken{

	private int value;
	
	private Operand(int value){
		this.value = value;
	}
	
	public static Operand of(int value){
		return new Operand(value);
	}
	
	public int getValue() {
		return value;
	}
	
}
