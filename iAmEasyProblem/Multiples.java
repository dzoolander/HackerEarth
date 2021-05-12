/**
 * 
 */
package iAmEasyProblem;
import java.util.*;

/**
 * @author 	Derek Krebs
 * @date	May 11, 2021
 */
public class Multiples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);		
			}
	}

}
