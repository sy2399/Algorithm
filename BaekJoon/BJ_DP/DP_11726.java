package BJ_DP;
import java.util.*;

/**
 * 
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 1. 하나를 놓는 경우 d[n-1]
 * 2. 두개를 놓는 경우 d[n-2]  
 * 
 * 점화식 : d[n] = d[n-1] + d[n-2]
 * (피보나치 수열과 같은 점화식이 나온다)
 * @author imsoyoung
 *
 */
public class DP_11726 {
	static int[] dp;
	
	//TOP-DOWN
    public static int topDown (int n) {
        if (n == 0 || n == 1) return 1;
        if (dp[n] > 0) return dp[n];
  
        dp[n] = topDown(n-2) + topDown(n-1);
        dp[n] %= 10007; // 여기서 10007 나머지계산을 하지 않으면, 이전의 d[n] 도 값이 전부 틀려져버리기 때문에 d[n]을 구할 때 마다 10007의 나머지계산을 진행 후에 저장
  
        return dp[n];
    }
    
  //BOTTOM-UP
    public static int bottomUp (int n) {
        dp[0] = 1;
        if (n > 0) dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= 10007; // 이 부분도 마찬가지
        }
        
        return dp[n];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dp = new int[num+1];
		System.out.println(topDown(num));

	}
}
