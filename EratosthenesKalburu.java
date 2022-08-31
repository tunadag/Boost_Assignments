package breakassignments;

import java.util.ArrayList;
import java.util.Scanner;

public class EratosthenesKalburu {

	public static void main(String[] args) {
		
		System.out.println("Bir sayi giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<Integer> prime = new ArrayList<>();
		
		for (int i=1; i<=n;i++) {
		prime.add(i);
		}
			
		System.out.println(prime); // n'e kadar sayılardan oluşan diziyi görüntülüyorum.
		prime.set(0, 0); // 1 asal sayı olmadığından 0 rakamı ile işaretledim.
		
		for (int j=2; j<=n; j++) {
			
			for (int k=2; k<n; k++) {
				if (prime.get(k) == j) 
					continue;
				if (prime.get(k)%j == 0) {
				prime.set(k,0);} //asal olmayan sayıları 0 rakamı ile işaretledim.
				continue;
			}
			
		System.out.println(prime);
		}
//devamında n'e kadar olan asal sayıları tek bir dizide göstermek için :
		
/*		System.out.println(prime);
		
		ArrayList<Integer> lastprime = new ArrayList<>();
		int i = 0;
		for (i=0;i<n;i++) {
			if (prime.get(i) != 0)
				lastprime.add(prime.get(i));
				}
		System.out.println(lastprime);
*/		
	}
		
}

				
		
			
				
	


