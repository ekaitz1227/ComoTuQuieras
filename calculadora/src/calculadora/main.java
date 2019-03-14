package calculadora;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		num1= sc.nextInt();
		System.out.println("Introduce otro numero: ");
		num2= sc.nextInt();
		suma(num1, num2);
		
		
	}
	public static void suma(int num1, int num2) {
		int suma=0;
		suma=num1+num2;
		System.out.println("la suma de los dos numeros es:"+suma);
	}
}