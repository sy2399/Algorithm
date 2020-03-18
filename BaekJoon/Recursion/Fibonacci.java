package Recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Fobinacci");
		Scanner sc = new Scanner(System.in);
		System.out.println("N번째 피보치 수 - N 입력:  ");
		int input = sc.nextInt();
		
		int fibo_value = fibo(input);
		System.out.println(input + "번째 피보나치 수 : " +fibo_value);
	}
	
	//N번째 피보나치 수를 찾는 함수
	
	public static int fibo(int n) {
		int fibo_value=0;
		if (n == 0) {
			fibo_value = 0;
		}else if(n==1) {
			fibo_value = 1;
		}else {
			fibo_value = fibo(n-1) + fibo(n-2);
		}
		return fibo_value;
	}
}
