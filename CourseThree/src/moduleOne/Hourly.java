/**
 * Java Course 3, Module 1
 * 
 * Hands-on Assignment 1: Inheritance and Polymorphism (Graded)
 * 
 * Hourly Class
 */
package moduleOne;

/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 1
 * @CreatedDate May 27, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class Hourly extends Employee {

	//instance variables for Hourly class
	double hourlyPay;
	double hoursWorked;
	
	//overrides load method in Employee
	public void load() {
		super.load(); //calls the load method in Employee
		System.out.print("Hourly pay ==> ");
		this.hourlyPay = input.nextDouble();
		
		System.out.print("Hours worked this past week ==> ");
		this.hoursWorked = input.nextDouble();

	}

	//implemented abstract method due to extention of Hourly class to Employee class
	@Override
	public double getEarnings() {
		
		//if-else statements to check if employee had worked more than 40 hours. Will also check if calculated paycheck is more than 1000.
		if(hoursWorked > 40 ) {
			if (((hourlyPay * 40) + ((hourlyPay * (hoursWorked-40))*1.5)) > 1000) {
				return 1000;
			}
			else {
				return (hourlyPay * 40) + ((hourlyPay * (hoursWorked-40))*1.5); 
			}
		}
		else if (hourlyPay * hoursWorked > 1000){
			return 1000;
		}
		else {
			return hourlyPay * hoursWorked;
		}
	}
}
