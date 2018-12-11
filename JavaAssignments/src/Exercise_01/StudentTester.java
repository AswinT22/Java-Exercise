package Exercise_01;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student= new Student();
		
		//Input 1
		student.setStudentId(1001);
		student.setName("Jacob");
		student.setQualifyingMarks(80);
		student.setResidentialStatus('H');
		student.setYearOfEngg(3);
		
		
		//Input 2	
//		student.setStudentId(1002);
//		student.setName("Peter");
//		student.setQualifyingMarks(83);
//		student.setResidentialStatus('D');
//		student.setYearOfEngg(2);
		
		
		
		
		System.out.println("***********Student Information*********** \n");
		System.out.printf("\n\tStudent Name\t\t:%s\n",student.getName());
		System.out.printf("\tStudent Id\t\t:%d\n",student.getStudentId());
		System.out.printf("\tQualifying Marks\t:%.1f\n",student.getQualifyingMarks()); // only one floating point
		System.out.printf("\tYear of engineering\t:%d\n",student.getYearOfEngg());
		char temp=student.getResidentialStatus();
		System.out.printf("\tResidental Status\t:%s\n",temp =='H'?"Hostellers":temp=='D'?"Day Scholar":"");
		
	}

}
