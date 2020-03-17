package BJ_IO;

import java.util.*;

/**
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 * 
 * Input : 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 * 
 * Output : 입력받은 그대로 출력한다.
 * 
 * 11718 과의 차이 : 공백, 빈줄 포함  
 * 
 * 
 * Scanner는 입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽는다.
 * **/
public class IO_11719 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		int count = 0;
		
		while(sc.hasNextLine()) {
			count++;

			String lines = sc.nextLine();
			if ((count >100)) {
				break;
			}
			
			if (lines.isEmpty()) {
				lines += "\n";
			}
			output += (lines);
			
				
		}
		System.out.println(output);
		sc.close();
	}
}
