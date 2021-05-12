/*
 * Author: Derek Krebs	May 11, 2021
 */
package stringProblem;

import java.util.*;

public class VowelStringProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 1;
		int numStrings = s.nextInt();
		String name = s.nextLine();
		
			while (count <= numStrings) {
				name = s.nextLine();
				if (name.contains("a") && name.contains("e") && name.contains("i") && name.contains("o") && name.contains("u")) {
					System.out.println("lovely string");
				}
				else if (name.contains("A") && name.contains("E") && name.contains("I") && name.contains("O") && name.contains("U")) {
					System.out.println("lovely string");
				}
				else {
					System.out.println("ugly string");
				}	
				count++;
			}
		s.close();	
	}
}