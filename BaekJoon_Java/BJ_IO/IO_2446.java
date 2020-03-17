package BJ_IO;
import java.util.*;

/**
 
 Pattern
 
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********


 **/
public class IO_2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		//i=0 ~ i=4
		//공백 수 : 2*i
		//별의 수 : (2*num-1) - 2*i
		//
		
		for(int i=0;i<num;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*num-1)-2*i;j++) {
				System.out.print("*");
			}
			
	
			System.out.println();
		}
		
		for(int i=num-2;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*num-1)-2*i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		
		
	}
}
