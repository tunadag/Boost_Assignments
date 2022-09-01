package breakassignments;

import java.util.Scanner;

public class MatriksTranspoze {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Matriks satir sayisini giriniz: ");
		int i = sc.nextInt();
		System.out.println("Matriks sutun sayisini giriniz: ");
		int j = sc.nextInt();
		int[][] matriks = new int[i][j];
		
		for (int k=0; k<i; k++) {
			for (int m=0; m<j; m++) {
				System.out.print("Matriksin " + (k+1) + ".satir " + (m+1) + ".sutun degerini giriniz: ");
				matriks[k][m] = sc.nextInt();
			}
			System.out.println();			
		}
		
		System.out.println("---MATRIKS---");
		for (int k=0; k<matriks.length;k++) {
			for (int m=0; m<matriks[0].length; m++) {
				System.out.print(matriks[k][m] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("---TRANSPOZE MATRIKS---");
//		int[][] transpozeMatriks = new int[matriks[0].length][matriks.length];
		for (int k=0; k<matriks[0].length;k++) {
			for (int m=0; m<matriks.length; m++) {
				System.out.print(matriks[m][k] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
