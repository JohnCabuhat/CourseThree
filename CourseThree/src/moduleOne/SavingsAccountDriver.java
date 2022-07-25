/**
 * Java Course 3, Module 1
 * 
 * Ungraded Practice Activity 1 - Savings Account Comparison
 * 
 * SavingsAccount Driver Class
 */
package moduleOne;

/**
 * @author John Elli Cabuhat
 * @description Ungraded Practice Activity 1
 * @CreatedDate May 25, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class SavingsAccountDriver extends SavingsAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//creating objects saver1 and saver2
		SavingsAccount saver1 = new SavingsAccount(10002, 2000);
		SavingsAccount saver2 = new SavingsAccount(10003, 3000);
		
		// setting interest to 0.05
		setInterest(0.05);
		
		//printing format 
		System.out.println("Monthly balances for one year with " + annualInterestRate + " annual interest:");
		System.out.printf("%s  %s  %s  %s  %s", "Month", "Account#", "Balance","Account#","Balance\n");
		System.out.printf("%s    %s    %s    %s    %s", "----", "----", "----","----","----\n");
		
		double total = 0;
		
		//for loop for updating balance 
		for(int i = 0; i <= 12; i++) {
			System.out.printf("%2d     %d    %.2f     %d   %.2f\n", i, saver1.getAccNum(),saver1.getBalance(),saver2.getAccNum(),saver2.getBalance());
			saver1.addMonthlyInterest(saver1.getBalance());
			saver2.addMonthlyInterest(saver2.getBalance());
			
			//conditional statement for getting the total of the two last displayed balances
			if(i==11) {
				total = saver1.getBalance() + saver2.getBalance();
			}
			
		}
		//display total
	System.out.println(String.format("\nFinal balance of both accounts combined: %.2f",total));

	}//end main

}//end class
