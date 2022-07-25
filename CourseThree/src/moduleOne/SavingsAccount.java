/**
 * Java Course 3, Module 1
 * 
 * Ungraded Practice Activity 1 - Savings Account Comparison
 * 
 * SavingsAccount Class
 */
package moduleOne;

/**
 * @author John Elli Cabuhat
 * @description Ungraded Practice Activity 1
 * @CreatedDate May 25, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class SavingsAccount {

	//variable initialization
	static double annualInterestRate;
	private final int ACCOUNT_NUMBER;
	private double balance;
	
	
	//two-parameter constructor
	public SavingsAccount(int accNum, double balance) {
		this.ACCOUNT_NUMBER = accNum;
		this.balance = balance;
	}
	
	//no parameter constructor
	public SavingsAccount() {
		this.ACCOUNT_NUMBER = 0;
	}
	
	//getting the account number value
	public int getAccNum() {
		return this.ACCOUNT_NUMBER;
	}
	
	//getting the balance value
	public double getBalance() {
		return this.balance;
	}
	
	//updating the current balance based on annual interest rate
	public void addMonthlyInterest(double addBalance) {
		balance += (addBalance * (annualInterestRate/12)); 
	}
	
	//setting the annual interest rate value
	public static void setInterest(double intRate) {
		annualInterestRate = intRate;
	}
}
