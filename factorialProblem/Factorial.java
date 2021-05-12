/**
 * 
 */
package factorialProblem;
import java.util.*;

/**
 * @author 	Derek Krebs
 * @date	May 11, 2021
 */
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int factorial = 1;
		s.close();
		
		while (n > 0 ) {
			factorial  = factorial * n;
			n--;
		}
		
		System.out.println(factorial);

	}

}
