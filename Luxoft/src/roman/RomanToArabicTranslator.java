package roman;

import roman.RomanToArabicTranslator.RomanDto;

public class RomanToArabicTranslator {
	
	class RomanDto{
		String romanNumber;
	}
	
	public int translate(String romanNumber){
		
		int arabicResult = 0;
		
		RomanDto romanDto = new RomanDto();
		romanDto.romanNumber = romanNumber;
		
		while (romanDto.romanNumber.length() > 0){
			arabicResult += substractValue(romanDto);
		}
		
		return arabicResult;
	}

	private int substractValue(RomanDto romanDto) {
		
		RomanValues first;		
		
		first = findTwoSignValue(romanDto.romanNumber);
		if (first == null){
			first = findOneSignValue(romanDto.romanNumber);
		}
		
		romanDto.romanNumber = romanDto.romanNumber.substring(first.name().length());
		return first.getValue();
		
	}

	private RomanValues findTwoSignValue(String romanNumber) {
		if (romanNumber.length() > 1){
			try{
				return RomanValues.valueOf(romanNumber.substring(0,2));
			} catch (IllegalArgumentException e){
				return null;
			}
		} else{
			return null;
		}
	}

	private RomanValues findOneSignValue(String romanNumber) {
		return RomanValues.valueOf(romanNumber.substring(0,1));
	}

}
