package Recursion;
import java.util.Scanner;

public class Factorial {
	/*
	 * 재귀 기초 - factorial
	 * */

	public static void main(String[] args) {
		int fact = 0;
		int input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input integer (N) : ");
		input = sc.nextInt();
		fact = factorial(input);
		System.out.println("" + input + " Facorial : "+ fact);
	}  
	
	public static int factorial(int n) {
		
		int fact;
		
		if (n==0) { //0! = 1
			fact = 1;
		}else {
			fact = n * factorial(n-1); 
		}
		return fact;
	}
}
