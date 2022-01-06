package application;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int prodA = sc.nextInt();
		int prodB = sc.nextInt();
		
		Produto prod = new Produto(prodA, prodB);
		
		System.out.println("PROD = " + prod.totalProd());
		
		sc.close();
	}
}
