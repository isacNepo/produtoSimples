package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int prodA;
		int prodB;
		int totalProd;
		
		prodA = sc.nextInt();
		prodB = sc.nextInt();
		
		totalProd = prodA * prodB;
		
		System.out.println("PROD = " + totalProd);
		
		sc.close();
	}
}
