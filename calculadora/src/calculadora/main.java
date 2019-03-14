package calculadora;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=4;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		num1= sc.nextInt();
		System.out.println("Introduce otro numero: ");
		num2= sc.nextInt();
		resta(num1,num2);
	}
	public static void resta(int num1, int num2) {
		int resta = num1 - num2;
	}
}