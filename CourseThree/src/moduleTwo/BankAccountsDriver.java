/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)
 * 
 * BankAccountsDriver class
 */
package moduleTwo;

/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 2
 * @CreatedDate May 31, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class BankAccountsDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Given main code 
		BankAccount[] accounts = new BankAccount[100];
		accounts[0] = new Savings(1100, .05);
		accounts[0].deposit(100);
		accounts[0].withdraw(200);
		((Savings) accounts[0]).addInterest();
		accounts[1] = new Checking(-100);
		accounts[1].deposit(50);
		accounts[2] = new Checking(200);
		accounts[2].withdraw(210);
		accounts[2].deposit(100);
		((Checking) accounts[2]).writeACheck(50);
		for (int i=0; i<accounts.length && accounts[i] != null; i++)
		{
		accounts[i].display();
		}

	}

}
