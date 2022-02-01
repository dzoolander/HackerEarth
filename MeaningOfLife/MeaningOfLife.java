package MeaningOfLife;
import java.util.*;

/**
 * @author 	Derek Krebs 
 * @date	2022
 *
 */

public class MeaningOfLife {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		while (num != 42) {
			System.out.println(num);
			num = s.nextInt();
		}
		
		s.close();

	}

}
