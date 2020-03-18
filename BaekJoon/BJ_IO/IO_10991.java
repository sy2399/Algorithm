package BJ_IO;
import java.util.*;

/**
 
   *
  * *
 * * *
* * * *
 
 * **/
public class IO_10991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//별의 수 : i
		//왼쪽 공백 수 : num-i
		for(int i=1;i<=num;i++) {
			
			//왼쪽 공백 출력 
			for(int j=0;j<num-i;j++) 
				System.out.print(" ");
				
			//별찍기  (별 사이사이 공백 추가!)
			for(int j=0;j<i;j++) {
				System.out.print("*");
				if(j != i-1) {
					System.out.print(" ");
				}
				
			}
			System.out.println();
				
			
		}
	}
}
