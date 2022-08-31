package breakassignments;

import java.util.Arrays;
import java.util.Scanner;

public class KcocugaTpasta {

	public static void main(String[] args) {
		int cs;
		System.out.println("Cocuk sayisini giriniz: ");
		Scanner sc = new Scanner(System.in);
		cs = sc.nextInt();
		System.out.println("Pasta cesidi sayisini giriniz: ");
		int pc = sc.nextInt();
		String[] pastaListesi = new String[pc] ;
		for (int i=0; i<pc; i++) {
			System.out.println("Pasta cesidi ismini giriniz: ");
			String pt = sc.next();
			pastaListesi[i] = pt;
			}
		System.out.println(Arrays.toString(pastaListesi));
		}
		
	}


