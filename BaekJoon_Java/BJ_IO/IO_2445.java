package BJ_IO;
import java.util.*;

/**
Pattern
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 * Input : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * Output : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *
 */
public class IO_2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			for(int j=0;j<2*num -2*i;j++) 
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=num-1;i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			for(int j=0;j<2*num -2*i;j++) 
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
