package Arrays;

import java.util.Arrays;

public class EmployeeRecord {
	public static void main(String args[]) {
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		 int n = salary.length;
		 float average= average(salary,n);
		 System.out.printf("The average salary of the employee is :%.1f \n",average);
		 long greater=Arrays.stream(salary).filter(x -> x >average).count();
		 System.out.printf("The number of employees having salary greater than the average is :%d \n",greater);
		 System.out.printf("The number of employees having salary lesser than the average is :%d \n",n-greater);
		
	}
	static float average(double salary[], int n) 
    { 
          
        // Find sum of array element 
        int sum = 0; 
          
        for (int i = 0; i < n; i++) 
            sum += salary[i]; 
      
        return sum / n; 
    }

}
