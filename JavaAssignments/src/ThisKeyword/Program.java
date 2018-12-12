package ThisKeyword;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate chocolate=new Chocolate(101,"Cadbury",12,10);
		
		//Values from constructor
//		System.out.println("\n\n***********Chocolate Details*********** \n");
//		System.out.printf("\n \tBarCode \t:%d\n",chocolate.getBarcode());
//		System.out.printf("\tName Id\t\t:%s\n",chocolate.getName());
//		System.out.printf("\tCost\t\t:%d\n",chocolate.getCost()); 
//		System.out.printf("\tWeight\t\t:%d\n",chocolate.getWeight());
		
		chocolate.setBarcode(102);
		chocolate.setName("Cadbury 5 star");
		chocolate.setCost(15);
		chocolate.setWeight(30);
		
		System.out.println("\n\n***********Chocolate Details*********** \n");
		System.out.printf("\n \tBarCode \t:%d\n",chocolate.getBarcode());
		System.out.printf("\tName Id\t\t:%s\n",chocolate.getName());
		System.out.printf("\tCost\t\t:%d\n",chocolate.getCost()); 
		System.out.printf("\tWeight\t\t:%d\n",chocolate.getWeight());
		
		
	}

}
