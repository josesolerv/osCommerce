package model;

public enum PaymentMethod {
	CASH_ON_DEVELIVERY("cod");
	
	private String value;
	
	private PaymentMethod(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
