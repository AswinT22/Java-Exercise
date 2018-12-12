package Exercise_03;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		setBreadth(5);
		setLength(10);
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
    
	public void calculatePerimeter() {
		
		System.out.println(2*(length+breadth));
		
	}
}

