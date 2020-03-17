package BJ_IO;
import java.util.*;
/**
 
  *
 **
***
 **
  *
 
 * **/

public class IO_2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// i=1 ~ num
		// 공백 수 : num-i 
		// 별의 수 : i
		
		for(int i=1;i<=num;i++) {
			for(int j=0;j<num-i;j++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("*");
				
			System.out.println();
		}
		
		for(int i=num-1;i>0;i--) {
			for(int j=0;j<num-i;j++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("*");
				
			System.out.println();
		}
	}
}
