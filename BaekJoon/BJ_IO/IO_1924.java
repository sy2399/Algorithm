package BJ_IO;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 
 * 4, 6, 9, 11월은 30일까지, 
 * 2월은 28일까지 있다.
 * 
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 
 * SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.


 * **/


public class IO_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //month
		int y = sc.nextInt(); //date
		
//		System.out.println(x +"월 " + y + "일 : ");
		String date;
		
		
		//참고 - Java SimpleDateFormat
		/*
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

		SimpleDateFormat format_day = new SimpleDateFormat("오늘은 M월의 w번째 주, d번째 날이며, F번째 E요일입니다.");
		Date today = new Date();
		
		System.out.println(format.format(today));

		System.out.println(format_day.format(today));
		 */

		//문제 접근 방법
		// 2007/1/1 이 월요일이라 주어졌음! 일주일은 7일!
		// 입력받은 날짜 - 1/1 총 날짜 구해서 7로 나눈 나머지
		// 0 : sunday /  1 : monday / 2 : tuesday / 3 : wednesday
		// ...
		
		
		// month를 고려해서 날짜 계산 
		int count = 0;

		String[] date_31 = {"1","3","5","7","8","10","12"};

		String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		
		if (x != 1) {
			for (int i = 1;i < x ;i++) {
//				System.out.println("I = " + i);
				boolean check = Arrays.asList(date_31).contains(i + "");
//				System.out.println("Check : " + check);
				
				if (check) {
//					System.out.println("31!!!!");
					count += 31;
					
				}else {
					if (i == 2) {
//						System.out.println("2월!!!!!!");
						count += 28;
					}else {
//						System.out.println("30!!!!!!");
						count += 30;
					}
				}
			}
		}
		
		
		count += y;
		
		int diff= count-1;
		
		int day = diff % 7;
//		System.out.println(diff + " " + day);
		System.out.println(days[day]);
		
			 
		
		

		
	}
}
