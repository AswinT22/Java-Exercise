package Constructor;

public class Chocolate {
	private int barcode;
	private String name;
	private int weight;
	private int cost;
	
	public Chocolate() {
		
		barcode = 101;
		name = "Cadbury";
		weight = 12;
		cost = 10;
	}
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
