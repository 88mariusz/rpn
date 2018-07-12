package mariusz;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class MyTest{

	public static void main(String[] args) {
		
		int[] tab = new int[]{1,2,3};
		
		List<Integer> intArrayAsList = intArrayAsList(tab);
		
		System.out.println(intArrayAsList);
		tab[1] = 88;
		System.out.println(intArrayAsList);
		tab = new int[]{5,6,7};
		System.gc();
		System.out.println(intArrayAsList);
		
		
		Float nan = Float.NaN;
		Float one = 1.0F;
		
		System.out.println(nan > one);
		System.out.println(nan < one);
		
		
		args = new String[]{"a", "b", "c", "a", "d"};
		
		Set<String> hs = new HashSet<>();
		
        hs.addAll(Arrays.asList(args));//.subList(1, args.length)); 
        System.out.println(hs); 
        
		
		
	}

	static List<Integer> intArrayAsList(final int[] a) {
		if (a == null)
		throw new NullPointerException();
		return new AbstractList<Integer>() {
			public Integer get(int i) {
				return a[i]; // Autoboxing (Item 5)
			}
			
			@Override public Integer set(int i, Integer val) {
				int oldVal = a[i];
				a[i] = val; // Auto-unboxing
				return oldVal; // Autoboxing
			}
			
			public int size() {
					return a.length;
			}
		};
	}
	
}
