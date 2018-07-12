package kumorek;

import java.util.HashMap;
import java.util.Map;

public class MutableClass {

	public static void main(String[] args) {
		
		HashMap<MutableClass, Integer> map = new HashMap<>();
		MutableClass mut1 = new MutableClass(1);
		map.put(mut1, 1);
		mut1.setValue(2);

//		map.put(new MutableClass(1), 2);
//		map.put(new MutableClass(2), 3);

		System.out.println("" + map);
		System.out.println("" + map.get(new MutableClass(1)) + map.get(new MutableClass(2)) + map.get(new MutableClass(3)));
		
		
//		System.out.println("" + map + map.size());
		
	}
	
	private int value;
	
	public MutableClass(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MutableClass [value=" + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MutableClass other = (MutableClass) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
}
