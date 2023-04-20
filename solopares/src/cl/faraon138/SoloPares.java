package cl.faraon138;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		int i=0;
	Scanner sc=new Scanner (System.in);
		System.out.println("Ingrese un numero: ");
		int n=sc.nextInt();
		
			while (i<=n) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
			}
	}



	}


