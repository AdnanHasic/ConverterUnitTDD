
public class ConverterUnit {
	
	private double valueOfLength;

	public ConverterUnit() {
		
	}

	public ConverterUnit(double valueOfLength) {
		
		this.valueOfLength = valueOfLength;
	}

	public double getValueOfLength() {
		return valueOfLength;
	}
	
	public void valueOfLengthIsLessThanOrEqualToZero() {
		
		if (valueOfLength <= 0) {
			this.valueOfLength = 1;
		}
	}

	public double fromKilogramsToPounds() {
		
		return this.valueOfLength * 2.2046;
	}
	
	public double fromPoundsToKilograms() {
		
		return this.valueOfLength / 2.2046;
	}
	
	public double fromCentimetersToInches() {
		
		return this.valueOfLength * 0.39370;
	}
	
	public double fromInchesToCentimeters() {
		
		return this.valueOfLength / 0.39370;
	}
}
