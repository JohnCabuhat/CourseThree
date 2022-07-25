/**
 * Java Course 3, Module 1
 * 
 * Hands-on Assignment 1: Inheritance and Polymorphism (Graded)
 * 
 * Employee Class
 */
package moduleOne;
import java.util.Calendar;
import java.util.Scanner;
/**
 * @author John Elli Cabuhat
 * @description Hands-on Assignment 1
 * @CreatedDate May 27, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public abstract class Employee{

	//instance variables for Employee class
	String name;
	String sss;
	int birthMonth;
	int birthWeek;
	Scanner input = new Scanner(System.in);
	
	//prompts and loads the instance variables
	public void load() {
		System.out.print("Name ==> ");
		this.name = input.nextLine();
		
		System.out.print("Social Security Number ==> ");
		this.sss = input.nextLine();
		
		System.out.print("Birthday month (1-12) ==> ");
		this.birthMonth = input.nextInt();
		
		System.out.print("Birthday bonus week (1-4) ==> ");
		this.birthWeek = input.nextInt();
		
	}
	
	//returns name, social security number, and calculated paycheck in format
	public String toString() {
		return String.format("employee: %s\nsocial security number: %s\npaycheck: %.2f",name,sss,(getEarnings()+getBonus()));
	}
	
	//returns 100 if input birthmonth and birthweek matches today's month and week
	public double getBonus() {
		int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int todayWeek = Calendar.getInstance().get(Calendar.WEEK_OF_MONTH);
		
		if(birthMonth == todayMonth && birthWeek == todayWeek) {
			return 100;
		}
		return 0;
	    
	}
	
	//abstract class to be implemented in child classes.
	public abstract double getEarnings();
}
