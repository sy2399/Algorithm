package BJ_DP;
import java.util.*;

/**
 * 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * #11726 과의 차이 :가로 길이가 2개인 타일이 추가되는 경우가 *2
 * 
 * 1칸 채우는 경우 : d[n-1]
 * 2칸 채우는 경우 : d[n-2]*2
 * @author imsoyoung
 *
 */
public class DP_11727 {
static int[] dp;
	
	//TOP-DOWN
    public static int topDown (int n) {
        if (n == 0 || n == 1) return 1;
        if (dp[n] > 0) return dp[n];
  
        dp[n] = topDown(n-2)*2 + topDown(n-1);
        dp[n] %= 10007; 
  
        return dp[n];
    }
    
  //BOTTOM-UP
    public static int bottomUp (int n) {
        dp[0] = 1;
        if (n > 0) {
        	dp[1] = 1;
        	
        };
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-2]*2 + dp[i-1];
            dp[i] %= 10007; // 이 부분도 마찬가지
        }
        
        return dp[n];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dp = new int[num+1];
		System.out.println(bottomUp(num));

	}
}
