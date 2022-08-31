package breakassignments;

import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) {
		
		String x = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tersini yazdirmak istediginiz kelimeyi yaziniz: ");
		x = sc.nextLine();
		sc.close();
		for(int i = x.length()-1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}
// Özyinelemeli yöntem ile:
	
//		System.out.println(recursiveMethod("Antalya"));
	
	}
//		public static String recursiveMethod(String str) {
//		if ((null == str) || (str.length() <= 1)) {
//		return str;
//		}
//		return recursiveMethod(str.substring(1)) + str.charAt(0);
		
		
//	}

}