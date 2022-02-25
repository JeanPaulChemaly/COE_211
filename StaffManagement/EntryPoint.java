import java.util.Scanner;
public class EntryPoint{
	public static void main(String[] args){
		int rnd = (int)(Math.random()*10+1);
		for(int i=0; i<rnd; i++) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You have " + rnd + " insertions left");

		System.out.println("Please input the employee's first name: ");
		String first = scan.nextLine();
		
		System.out.println("Please input the employee's last name: ");
		String last = scan.nextLine();
		
		System.out.println("Please input the employee's age: ");
		int age = scan.nextInt();
		
		System.out.println("Please input the employee's salary: ");
		double salary = scan.nextDouble();
		
		Employee employee = new Employee(first, last, age, salary);
		System.out.println("Employee Information: " + first + ", " + last + ", " + age + ", " + salary);
		
		scan.close();

		}
	
	}
}
		

		