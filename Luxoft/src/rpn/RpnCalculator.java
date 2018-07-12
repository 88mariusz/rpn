package rpn;

import java.util.List;
import java.util.Optional;

public class RpnCalculator {

	private List<RpnToken> calculation;

	public RpnCalculator(List<RpnToken> inputOperation){
		this.calculation = inputOperation;
	}
	
	public Operand calculate(){
			
		int i = 0;
		while (calculation.size() > 1){
			Optional<Operand> tripleValue = checkTriple(i);
			if (tripleValue.isPresent()){
				replaceTripleWithValue(i, tripleValue.get());
				i = 0;
			} else {
				++i;
			}
		}
				
		return (Operand) calculation.get(0);
	}

	private Optional<Operand> checkTriple(int i) {
		
		if (Operand.class.isInstance(calculation.get(i)) && 
			Operand.class.isInstance(calculation.get(i+1)) &&
			Operator.class.isInstance(calculation.get(i+2))) {
				return Optional.of(Operand.of((
						(Operator) calculation.get(i+2)).apply(
							((Operand) calculation.get(i)).getValue(), 
							((Operand) calculation.get(i+1)).getValue()))
					);
		} else{
			return Optional.empty();
		}
	}

	private void replaceTripleWithValue(int i, Operand value) {
		calculation.remove(i+2);
		calculation.remove(i+1);
		calculation.remove(i);
		calculation.add(i, value);		
	}
	
}
