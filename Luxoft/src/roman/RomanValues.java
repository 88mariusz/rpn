package roman;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.TreeMap;
import static java.util.stream.Collectors.toMap;

public enum RomanValues {

	I(1),
	IV(4),
	V(5),
	IX(9),
	X(10),
	XL(40),
	L(50),
	XC(90),
	C(100),
	D(500),
	CM(900),
	M(1000);
	
	int value;
	
	public int getValue(){
		return value;
	}
	
	private RomanValues(int value){
		this.value = value;
	}
	
    public static NavigableMap<Integer, String> asNavigableMap(){
		return Arrays.asList(values()).stream()
				.collect(toMap(RomanValues::getValue, RomanValues::name, 
					(u, v) -> u, () -> new TreeMap<Integer, String>()));
	}
	
	
	
}
