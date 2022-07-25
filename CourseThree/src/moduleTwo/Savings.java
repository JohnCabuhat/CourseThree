/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)
 * 
 * Savings class
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
public class Savings extends BankAccount {

	double intRate;
	
	//Constructor that accepts input balance and interest rate
	public Savings(double newBalance, double intRate) {
		this.intRate = intRate;
		this.balance = newBalance;
	}
	
	//Adding the interest amount to the current balance 
	public void addInterest() {
		balance += (intRate * balance);
	}
	
	//Method implemented due to extension. Displays current balance with currency format 
	@Override
	void display() {
		Locale usa = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		System.out.println("Savings account balance = " + dollarFormat.format(balance));
		
	}
}
