package breakassignments;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String x = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrom kontrolu yapilacak kelimeyi yaziniz: ");
		x = sc.nextLine();
		
		int k = 0;
		int i = x.length();
		boolean palindrom = true;
		do {
			if (x.charAt(i-1) != x.charAt(k)) {
			System.out.println("Palindrom degil");
			palindrom = false;
			break;
			}
			else {
				i--;
				k++;
			}
			}
		while (k <= (x.length()/2));
		if (palindrom) System.out.println("Palindrom!");
		sc.close();		
		}	
		
	}

