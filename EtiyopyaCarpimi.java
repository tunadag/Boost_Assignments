package breakassignments;

import java.util.ArrayList;
import java.util.Scanner;

public class EtiyopyaCarpimi {

	public static void main(String[] args) {
		
		int sum = 0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		int a = sc.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		int b = sc.nextInt();
		sc.close();
		ArrayList<Integer> list = new ArrayList<>();
		do {
			System.out.println(a + " " + b);
			if (a%2 != 0) {
				list.add(b);
			}
			a = a/2;
			b = b*2;
		}
		while (a>0);
		
		System.out.println(list);
		for (int i=0; i <= list.size()-1; i++) {
			sum += list.get(i); 
		}
		System.out.println(sum);		
	}
}
			
