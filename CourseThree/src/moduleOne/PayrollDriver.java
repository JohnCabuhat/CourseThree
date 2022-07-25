/**
 * Java Course 3, Module 1
 * 
 * Hands-on Assignment 1: Inheritance and Polymorphism (Graded)
 * 
 * Payroll Driver Class
 */
package moduleOne;
import java.util.Scanner;
/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 1
 * @CreatedDate May 27, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class PayrollDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variable initialization for user input
		int numEmployees;
		int userChoice;
		
		//array for storage of string output
		String [] employees; 
		
		Scanner input = new Scanner (System.in);
		
		//Instantiating objects
		Hourly hourly = new Hourly();
		Salaried salaried = new Salaried();
		SalariedPlusCommission salaryComm = new SalariedPlusCommission();
		
		System.out.print("Number of employees: ");
		numEmployees = Integer.parseInt(input.nextLine());
		employees = new String[numEmployees];
		
		//for-loop for checking the type of employee
		for(int i = 0; i < numEmployees; i++) {
			System.out.println("\nPROFILE FOR EMPLOYEE #" + (i+1) + ":");
			System.out.println("type Hourly(1), Salaried(2), Salaried plus Commission(3)");
			System.out.print("Enter 1, 2, or 3 ==> ");
			userChoice = input.nextInt();
			
			//if-else statements to check for the type of employee
			if(userChoice == 1) {
				hourly.load(); //calling the load method depending on the userChoice input
				employees[i] = hourly.toString(); //storing string input format in array
			}
			
			else if(userChoice == 2) {
				salaried.load();
				employees[i] = salaried.toString();
			}
			
			else {
				salaryComm.load();
				employees[i] = salaryComm.toString();
			}
			
		}
		
		// for-each loop for displaying the values inside the array
		for (String record : employees) {
			System.out.println(record + "\n");
			input.close();
		}

	}
}
