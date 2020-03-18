package Recursion;

import java.util.Scanner;

public class Hanoi {
	public static void main(String[] args) {
		System.out.println("Hanoi Tower");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		hanoi(input, "A", "B", "C"); //Start(A) 에서 Target(C) 로 옮기겠다.
		
	}
	
	public static int hanoi(int n, String start, String temp, String target) {
//		System.out.println("Hanoi Start " + n);
		int count = 0;
		System.out.println("N : " + n + ", start : " + start + ", temp : " + temp + ", target : " + target);
		if(n == 1) {
			count = 1;
			System.out.println("If문 ---- Move " + n + " From "  + start + " To " + target); 
			
		}else if(n>1) {
			count ++;
			//n>1 일때까지 계속 hanoi 호출 (단, 호출될 때마다 start, temp, target 이 바뀜)
			//ex. n = 3
			
			//0.main : hanoi(3,a,b,c) 

			//1. hanoi(2,a,c,b) 호출 (n=3)
			//2. hanoi(1,a,b,c) 호출 (n=2) --> 3. if 문 print 실행 
			//4. hanoi(2,a,c,b) 실행 --> Else 문 print 실행 --> 5. hanoi(1,c,a,b) 호출 --> 6. if 문 print 실행  
			//6. hanoi(3,a,b,c) 실행 --> Else 문 print 실행 --> 7. hanoi(2,b,a,c) 호출 --> 8. hanoi(1,b,c,a) 호출 --> if문 print 실행 
			//9. hanoi(2,b,a,c) 실 --> Else 문 print 실행 --> 10. hanoi(1,a,b,c) 호출 --> if 문 print 실
		
			
			hanoi(n-1, start, target, temp);
			System.out.println("Else 문 --- Move " + n + " From " + start + " To " + target);
			hanoi(n-1, temp, start, target);
		}
		
		System.out.println("*****");
		return count;
		
	}
}
