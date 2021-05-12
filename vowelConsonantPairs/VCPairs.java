/**
 * 
 */
package vowelConsonantPairs;
import java.util.*;

/**
 * @author	Derek Krebs
 * @date	May 11, 2021
 */
public class VCPairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numCases = s.nextInt();
		int stringLen;
		String text;
		String vowels = "aeiou";
		int index = 0;
		int numOccurrences = 0 ;
		
		while (numCases > 0 ) {
			stringLen = s.nextInt();
			text = s.next();
			if (stringLen == 1) {
				System.out.println("0");
			}
			else {
				while (index < stringLen - 1) {
					if (vowels.indexOf(text.charAt(index+1)) != -1 ) {
						if (vowels.indexOf(text.charAt(index)) == -1) {
							numOccurrences++;
						}
					}
					index++;
				}
			System.out.println(numOccurrences);
			index = 0;
			}
			numCases--;
			numOccurrences = 0;
		}
		s.close();
	}

}
