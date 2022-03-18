import java.util.Scanner;
public class EntryPoint{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int x;
	String a;
	do{
	System.out.println("Which service would you like to use?" + "\n" +
				"[1]: Basic week visualizer" + "\n" +
				"[2]: Advanced week visualizer" + "\n" +
				"[3]: Basic calculator" + "\n" +
				"[4]: Employee repertoire");

	x = scan.nextInt();
	if (x>=1 && x<=4){
	if(x == 1){
		BasicWeek bW = new BasicWeek();
		bW.printDays();
	} 
	
	if(x == 2){
		AdvancedWeek aW = new AdvancedWeek();
		aW.printDays();
	}
	
	if(x == 3){
		Calculator Cal = new Calculator();
	}
	
	if(x == 4){
		Employee Emp = new Employee();
		System.out.println(Emp.toString());

	}
	}
	else {
		System.out.println("Please make sure you enter a number between 1 and 4");
	}
		System.out.println("Would you like to perform another operation? (y/n) ");
		scan.nextLine(); 
		a = scan.nextLine();	
		 
	}while(a.equalsIgnoreCase("y"));
	

	}
}	
