package model;

public enum ShippingMethod {
	FLAT_RATE("flat_flat"),
	PER_ITEM("item_item");
	
	private String value;
	
	private ShippingMethod(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
