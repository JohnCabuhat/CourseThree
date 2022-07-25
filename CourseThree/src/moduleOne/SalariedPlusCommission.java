/**
 * Java Course 3, Module 1
 * 
 * Hands-on Assignment 1: Inheritance and Polymorphism (Graded)
 * 
 * SalariedPlusCommission Class
 */
package moduleOne;

/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 1
 * @CreatedDate May 27, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class SalariedPlusCommission extends Employee {

	//instance variable for SalariedPlusCommission class
	double salesPastWeek;
	double commRate;
	
	//private instance variable
	private double payCheck;
	
	//overrides load method in Employee
	public void load() {
		super.load();
		System.out.print("Salary ==> ");
		this.payCheck = input.nextDouble();
		
		System.out.print("Sales for this past week ==> ");
		this.salesPastWeek = input.nextDouble();
		
		System.out.print("Sales commission rate (fraction paid to employee)  ==> ");
		this.commRate = input.nextDouble();
		
	}

	//implemented abstract method due to extension
	@Override
	public double getEarnings() {
		
		//if-else statements to check if calculated paycheck is more than 1000.
		if(payCheck + (salesPastWeek * commRate) > 1000) {
			return 1000;
		}
		else {
			
			return payCheck + (salesPastWeek * commRate);
		}
	}
}
