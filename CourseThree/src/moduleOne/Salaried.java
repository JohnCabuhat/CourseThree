/**
 * Java Course 3, Module 1
 * 
 * Hands-on Assignment 1: Inheritance and Polymorphism (Graded)
 * 
 * Salaried Class
 */
package moduleOne;

/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 1
 * @CreatedDate May 27, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class Salaried extends Employee {

	double weeklySalary;
	
	//overrides load method in Employee
	public void load(){
		super.load();
		System.out.print("Salary ==> ");
		this.weeklySalary = input.nextDouble();
		
	}

	//abstract method implemented due to extension
	@Override
	public double getEarnings() {
		
		//if-else statements to check if calculated paycheck is more than 1000.
		if(weeklySalary > 1000){
			return 1000;
		}
		else {
			return weeklySalary;
		}
	}
}
