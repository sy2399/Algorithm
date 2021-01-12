package BJ_IO;
import java.util.*;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 
 * Input : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 
 * Output : 입력으로 주어진 숫자 N개의 합을 출력한다.
 * 
 
 * **/
public class IO_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int testNum = sc.nextInt();
		
		//String으로 받은 input 을 구분자가 없는 상태에서 array로...
		
		String str = sc.next();

		
		for(int i=0;i<testNum;i++) {
			String character = str.substring(i, i+1);
			int num = Integer.parseInt(character);
			sum += num;
		}
		System.out.println(sum);

		System.out.println("1-->아스키코드 : "+ str.charAt(0)*1); // 49
		int test = str.charAt(0) - '0'; 
		System.out.println("1-->int : "+ test);		
		
		sc.close();
	}
}
