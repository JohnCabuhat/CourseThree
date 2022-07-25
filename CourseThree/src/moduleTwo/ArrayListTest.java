/**
 * Java Course 3, Module 2
 * 
 * Ungraded Practice Activity 2 - ArrayList
 * 
 * ArrayListTest Class
 */
package moduleTwo;

import java.util.ArrayList;

/**
 * @author John Elli Cabuhat
 * @description Ungraded Practice Activity 2
 * @CreatedDate May 30, 2022
 * @ModifiedDate 
 * @ModifiedBy
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> addressList = new ArrayList<String>(); 
		addressList.add("1600 Pennsylvania Avenue"); 
		addressList.add("221B Baker Street");
		addressList.add("8700 N.W. River Park Drive");
		
		for(String streetNames : addressList ) {
			System.out.println(streetNames);
		}

	}

}
