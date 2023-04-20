package cl.faraon138;

import java.util.Scanner;

public class SecuenciaFibonacci {

	public static void main(String[] args) {
		
				int a = 0;
				int b = 1;
				int c = 0;
				int i = 0;
				int n = 0;
				
				System.out.println("Ingrese ultimo numero: ");
				Scanner sc = new Scanner(System.in);

					n = sc.nextInt();
					do {
						a = b;
						b = c;
						System.out.println(c);
						c = a + b;
						i++; 
					} while (i < n); 
					sc.close();
				}
	}
