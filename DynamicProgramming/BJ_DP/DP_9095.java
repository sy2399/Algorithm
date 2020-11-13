package BJ_DP;
import java.util.*;

/**
 * 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * 
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 
 * Solution : 3가지 케이스 생각하기 (+1, +2, +3)
 * 
 * @author imsoyoung
 *
 */
public class DP_9095 {
	static int dp[] = new int[12];
	
	public static int bottomUp(int number) {
//		System.out.println(number);
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=number;i++) {
			dp[i] = dp[i-1] +dp[i-2]+dp[i-3];
		}
		return dp[number];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		
		int num[] = new int[testCase];
		
		for(int i=0;i<testCase;i++) {
			int n = sc.nextInt();
			num[i]=n;
			
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(bottomUp(num[i]));
//			System.out.println(i + ": " +num[i] + "*****");
		}
		sc.close();
		
		
	}
}
