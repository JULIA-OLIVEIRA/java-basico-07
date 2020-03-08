package br.fai.projeto07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		System.out.println("digite um valor: ");
		
		Scanner scanner = new Scanner(System.in);

		int valor1 = scanner.nextInt();
		int valor2 = scanner.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("valor da soma: " + soma);
		
	}
	

}
