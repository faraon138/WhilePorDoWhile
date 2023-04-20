package cl.faraon138;

import java.util.Scanner;

public class SumaImparlimite {

	public static void main(String[] args) {
		
		int suma = 0;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Ingrese numero inferior: ");
		int i=sc.nextInt();
		System.out.println("Ingrese numero superior: ");
		int n=sc.nextInt();
		
		for(i = i; i <= n; i++)
		{
			if(i % 2 != 0)
			{
				suma = suma+ i;
			}
		}
		System.out.println(suma);
	}
}