package Test;

public class Test2{
	int a;
	static int z;
	static {
		z=10;
		
		System.out.println("Static block");
		
		
	}
	 void get() {
		z=100;
		System.out.println(z);
	}
	
}
