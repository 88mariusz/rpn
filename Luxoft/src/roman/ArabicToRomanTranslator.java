package roman;

import java.util.Map.Entry;
import java.util.NavigableMap;

public class ArabicToRomanTranslator {
	
	public String translate(int arabic){
		
		int acc = arabic;
		StringBuilder romanResult = new StringBuilder();
		NavigableMap<Integer,String> romans= RomanValues.asNavigableMap();

		
		while (acc > 0){
			Entry<Integer, String> floorEntry = romans.floorEntry(acc);
			romanResult.append(floorEntry.getValue());
			acc -= floorEntry.getKey();
		}		
		
		return romanResult.toString();
	}

}
