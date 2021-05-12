package doctorSecretProblem;
import java.util.*;

/**
 * @author 	Derek Krebs 
 * @date	2021
 *
 */

public class DoctorSecret {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int	bookLength = s.nextInt();
		int numPages = s.nextInt();
		s.close();
		
		if (bookLength <= 23 && numPages >= 500 && numPages <= 1000 ) {
			System.out.println("Take Medicine");
		}
		else {
			System.out.println("Don't take Medicine");
		}

	}

}
