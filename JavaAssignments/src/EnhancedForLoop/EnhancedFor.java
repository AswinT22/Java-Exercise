package EnhancedForLoop;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer marks[]=initializeArray(new Integer[] {56,67,89,34,92});
		displayArray(marks);

	}
	

	private static void displayArray(Integer[] marks) {
		// TODO Auto-generated method stub
		for(int mark:marks)
			System.out.println(mark);
		
	}

	private static Integer[] initializeArray(Integer[] markList) {
		// TODO Auto-generated method stub
		Integer[] marks=new Integer[5];
		
		for(int i=0;i<marks.length;i++)
			marks[i]=markList[i];
		return marks;
		
	}

}
