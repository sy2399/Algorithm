package Recursion;
import java.util.*;

public class Hanoi_BJ {
	
    public static void solve(int n, int x, int y, StringBuilder sb) {
    	
        if (n == 0) return;
        
        solve(n-1, x, 6-x-y, sb);
        sb.append(x + " " + y + "\n");
        solve(n-1, 6-x-y,y, sb);
        
    }
    
    public static void main(String args[]) {
    	


    	//'A << B' 라는 수식이 있다고 하면, A 라는 녀석의 비트 값을 B 만큼 왼쪽으로 이동시키겠다.
    	
    	//a = a << 2;
    	
    	//연산 前, a = 0000 0000 0000 0000 0000 0000 0001 0000    // 16

    	//연산 後, a = 0000 0000 0000 0000 0000 0000 0100 0000    // 64
    	
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println((1<<n)-1);
        
        StringBuilder sb = new StringBuilder();
        solve(n, 1, 3, sb);
        System.out.println(sb);
    }
}