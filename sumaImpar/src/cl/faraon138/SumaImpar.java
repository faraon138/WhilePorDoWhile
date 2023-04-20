package cl.faraon138;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		int i=0;
		int suma = 0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Ingrese un numero: ");
		int n=sc.nextInt();
		
		for(i = 1; i <= n; i++)
		{
			if(i % 2 != 0)
			{
				suma = suma+ i;
			}
		}
		System.out.println(suma);
	}
}