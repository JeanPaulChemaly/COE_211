import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        // Initialize array of integers
	int[] assignments = new int[5];
	int attendence, midterm;
	double sumAssignments = 0.0;
 
        // for loop to get user input & store in array
	for(int i=0; i< assignments.length; i++){
		System.out.println("Enter the grade of assignment " + (i + 1) + ": ");
		assignments[i] = scan.nextInt();
		
	}
	System.out.println("Enter number of labs attended: ");
	attendence  = scan.nextInt();
	System.out.println("Enter miderm grade: ");
	midterm = scan.nextInt();

        // for loop to iterate over the array & perform calculations
	for(int i = 0; i<assignments.length; i++){
		 sumAssignments += assignments[i];
	}
        // display output to user

	double totalAssignment = (sumAssignments/5)*0.3;
	double totalAttendence = ((attendence/7.0) *100)* 0.05;
	double totalMidterm = midterm * 0.3;

	System.out.println("Assignments (30%): " + totalAssignment);
	System.out.println("Attendence (5%): " + totalAttendence);
	System.out.println("Midterm (30%): " + totalMidterm);
  
    }
}