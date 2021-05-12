/**
 * 
 */
package zooProblem;
import java.util.*;

/**
 * @author 	Derek Krebs 
 * @date	2021
 *
 */

public class Zoo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int zCount = 0;
        int oCount = 0;
        
        for (int i = 0; i < word.length(); i++) {
        	if (word.charAt(i) == 'z') {
        		zCount++;
        	}
        	else if (word.charAt(i) == 'o') {
        		oCount++;
        	}        	
        }
        
        if (zCount * 2 == oCount) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
        s.close();

	}

}
