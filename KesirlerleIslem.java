package breakassignments;

import java.util.Scanner;

public class KesirlerleIslem {
	
	
	public static void main(String[] args) {
		
		kesirlerleToplama();		
		
	}
	
	private static void kesirlerleToplama() {
		
		
		int paySonuc, paydaSonuc;
		int pay1, pay2, payda1, payda2;
		int okek = 0;
		int max, min, x;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ilk kesirin payini giriniz: ");
			pay1 = sc.nextInt();
			System.out.println("Ilk kesirin paydasini giriniz: ");
			payda1 = sc.nextInt();
			System.out.println("Diger kesirin payini giriniz: ");
			pay2 = sc.nextInt();
			System.out.println("Diger kesirin paydasini giriniz: ");
			payda2 = sc.nextInt();
			
			
			if (payda1 == payda2) {
				paySonuc = pay1 + pay2;
				paydaSonuc = payda1;
				System.out.println(pay1 + "/" + payda1 + " + " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
			}
			else {
				paySonuc = (pay1*payda2) + (pay2*payda1);
				paydaSonuc = payda1*payda2;
				System.out.println(pay1 + "/" + payda1 + " + " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
			}
			
			//EK GÖREV: SADELEŞTİRİLMİŞ SONUÇ
				
			if (payda1>payda2) {
				max = payda1;
				min = payda2;
			}
			else {max = payda2;
				min = payda1;
					}
			
			
			for (x=min; x>0; x--) {
				if(min%x == 0 && max%x==0) {
					// x, OBEB değeri
					okek = max*min/x;
					break;
					}
				}
			
			
			if (payda1 == payda2) {
				paySonuc = pay1 + pay2;
				paydaSonuc = payda1;
				System.out.println(pay1 + "/" + payda1 + " + " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
			}
			else {
				paySonuc = ((okek/payda1)*pay1) + ((okek/payda2)*pay2);
				paydaSonuc = okek;
				System.out.println(pay1 + "/" + payda1 + " + " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
			}
			

				//EK GÖREV: KESİRLERLE ÇALIŞAN HESAP MAKİNESİ


			
			System.out.println("Yapmak istediginiz islemi seciniz:\n 1-) Toplama\n 2-) Cikarma\n 3-) Carpma\n 4-) Bolme");
			
			int process = sc.nextInt();
			sc.close();	
			switch (process) {
			case 1:
				if (payda1 == payda2) {
					paySonuc = pay1 + pay2;
					paydaSonuc = payda1;
					System.out.println(pay1 + "/" + payda1 + " + " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
				}
				else {
					paySonuc = (pay1*payda2) + (pay2*payda1);
					paydaSonuc = payda1*payda2;
					System.out.println(pay1 + "/" + payda1 + " + " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
				}
				break;
			
			case 2:
				if (payda1 == payda2) {
					paySonuc = pay1 - pay2;
					paydaSonuc = payda1;
					System.out.println(pay1 + "/" + payda1 + " - " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
				}
				else {
					paySonuc = (pay1*payda2) - (pay2*payda1);
					paydaSonuc = payda1*payda2;
					System.out.println(pay1 + "/" + payda1 + " - " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
				}
				break;
			
			case 3:
				paySonuc = pay1*pay2;
				paydaSonuc = payda1*payda2;
				System.out.println(pay1 + "/" + payda1 + " * " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);
				break;
			
			case 4:
				paySonuc = pay1*payda2;
				paydaSonuc= payda1*pay2;
				System.out.println(pay1 + "/" + payda1 + " / " + pay2 + "/" + payda2 + " = " + paySonuc + "/" + paydaSonuc);	
				break;
					
			}
		}
	}
	
	
}
		
		
