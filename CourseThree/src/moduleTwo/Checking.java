/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)
 * 
 * Checking class
 */
package moduleTwo;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 2
 * @CreatedDate May 31, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class Checking extends BankAccount{

	//Constructor to accept input balance and loads it to the current balance
	public Checking (double balance) {
		if(balance <= 0) {
			this.balance = 0;
		}
		else {
			this.balance = balance;			
		}
	}
	
	//Method that subtracts the input value with the additional 1 for the service fee
	public void writeACheck(double checkAmount) {
		this.balance -= checkAmount+1; 
	}

	//Method implemented due to extension. Displays current balance with currency format
	@Override
	void display() {
		Locale usa = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		System.out.println("Checking account balance = " + dollarFormat.format(balance));
	} 

	

	
}
