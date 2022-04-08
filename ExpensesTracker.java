import java.io.*;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      String answer;
	FileWriter fw = new FileWriter(new File("expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outToFile = new PrintWriter(bw);

	Scanner scan = new Scanner(System.in);
	String name;
	String purchase;
	Double payment;
	
	do{
	System.out.println("Enter your name: ");
	name = scan.nextLine();
	
	System.out.println("What did you purchase? ");
	purchase = scan.nextLine();

	System.out.println("How much did you pay? (in USD) ");	
	payment = scan.nextDouble();

	outToFile.println( name + " purchased " + purchase + " for " + payment + " US Dollars.");
	
	System.out.println("Would you like to log another purchase? (y/n)");
	scan.nextLine();
	answer = scan.nextLine();
	}while(answer.equalsIgnoreCase("y"));
	
	outToFile.close();

	System.out.println("Get off of Zoodmall!");
	System.out.println("Would you like to read a summary of your purchases?(y/n)");
		String ans;
		ans = scan.nextLine();
		scan.close();
			if(ans.equalsIgnoreCase("y")){
				Scanner fileScan = new Scanner(new File("expenses.txt"));
				String summary;
				while(fileScan.hasNext()){
					summary = fileScan.nextLine();
					System.out.println(summary);
				}
			}
	
  }
}
