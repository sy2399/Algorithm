package BJ_DP;
import java.util.*;

/**
 * 45656이란 수를 보자.
 * 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
 * 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
 * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
 * 
 * 
 * @author imsoyoung
 *
 */
public class DP_10844 {
	static int dp[][];
	
	public static int bottomUp(int num) {
		//길이가 1일 때, 배열 초기화 [1][1] ~ [1][9] ==> 1
		//** 중요 **  [1][0], [1][10] 은 자동으로 0으로 초기화가 됨!!!
		for (int i = 1; i <= 9; i++) {
	        dp[1][i] = 1;
	    }
		
		//길이가 2 이상 일 때, input 값 num 의 길이 까지 dp[2][] ~ dp[num][] 모두 계산해서 저장 
	    for (int i = 2; i <= num; i++) {
	    	//[i][0] 의 값을 [i-1][1]로
	    	//[2][0] = [1][1] = 1
	    	//[2][1] = [1][0] + [1][2] = 0 + 1 = 1
	    	//[1][0], [1][10] 은 자동으로 0으로 초기화가 되었기 때문에, [i][0], [i][9] 에서 1씩 빠짐!!
	    	
	        dp[i][0] = dp[i - 1][1];
	        
	        for (int j = 1; j <= 9; j++) {
	            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
	        }
	    }
	 
	    int sum = 0;
	    for (int i = 0; i < 10; i++) {
	        sum += dp[num][i];
	    }
	    return sum;

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		dp = new int[101][11];
		
		System.out.println(bottomUp(num));
		sc.close();
	}
}
