package BJ_DP;
import java.util.*;

/**
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * 
 * X가 3으로 나누어 떨어지면, 3으로 나눈다
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 
 * Input : 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.
 * Output : 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.


solution(N) = min{0, f(N/3)+1, f(N/2)+1, f(N-1)+1}

- 0 (N=1일 경우), 
- f(N/3)+1, (N이 3의 배수일 경우)
- f(N/2)+1, (N이 2의 배수일 경우)
- (N-1)+1

 * @author imsoyoung
 *
 */

//
//if(n == 1) return 0; // base case
//if(dp[n] != -1) return dp[n]; // 이미 계산함
//
//int result = f(n-1) + 1;
//if(n%3 == 0) result = min(result, f(n/3) + 1);
//if(n%2 == 0) result = min(result, f(n/2) + 1);
//dp[n] = result;
//return result;



public class DP_1463 {
	static int[] dp = new int[100000];

	public static int solution_TopDown(int number) {
		
		
        // memoization
		if (dp[number] != -1) {
			
			return dp[number]; 
		} //dp[number] 가 -1이면, 이미 해당 number 에 대해 계산이 되었다는 의미!
			
		
		dp[number] = solution_TopDown(number-1) + 1; 
		//첫째줄에선 무조건 주어진 수(i)을 1로 만드는 최소 횟수는 = 'i-1을 1로 만드는 최소 횟수 + 1번'으로 한다. 
		//즉, 무조건 -1을 해서 해당 숫자를 만든다는 얘기다.(4를 만드는 최소 횟수 = 3을 1로 만드는 최소 횟수 + 1번) 
		//물론 이게 진짜 최소횟수로 나올 확률은 적다. 
		//하지만 이는 /2를 한 경우나 /3을 한 경우와 비교를 하기 위해 먼저 써준 것 뿐이며, /2나 /3이 안될 경우에는 이 값이 결국 최소 횟수 값을 계산하는데 쓰이게 된다(i=5인 경우가 그 예이다.)

		if (number % 3 == 0) {
			dp[number] = Math.min(dp[number], solution_TopDown(number/3)+1);
		} // number 가 3의 배수인 경우 
			
		
		else if (number % 2 == 0) {
			dp[number] = Math.min(dp[number], solution_TopDown(number/2)+1);

		}// number 가 2의 배수인 경우 
		
		
		return dp[number];
	}
	
	public static int soultion_Bottomup(int number) {
		
		
		for (int i = 2; i <= number; i++) { //최종 숫자는 n이기 때문에 n까지 반복연산
			dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
		return dp[number];
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dp = new int[num+1];
		Arrays.fill(dp, -1);
		dp[0] = dp[1] = 0;
		
		//top-down
		System.out.println(solution_TopDown(num));		
		
	}
}
