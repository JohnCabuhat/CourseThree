/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)
 * 
 * BankAccount class
 */
package moduleTwo;

/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 2
 * @CreatedDate May 31, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public abstract class BankAccount {
	
	double balance;
	
	//Method for adding the input amount to the current balance
	public void deposit(double newAmount) {
		this.balance += newAmount;
	}
	
	//Method for subtracting the input amount to the current balance
	public void withdraw(double withdrawAmount) {
		this.balance -= withdrawAmount;
		if (this.balance <= 0) {
			this.balance = 0;
		}
	}
	
	//Abstract method to be implemented to child classes.
	abstract void display();
}
