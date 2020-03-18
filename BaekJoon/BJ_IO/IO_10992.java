package BJ_IO;
import java.util.*;

public class IO_10992 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 1;
		for(int i=1;i<=num;i++) {
			
			//왼쪽 공백 : num - i(몇번째 라인인지에 따라 왼쪽 공백의 수 달라짐!)
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			
			
			if(i == 1) {
				//첫번째 라인 별 - 항상 1  
				System.out.print("*");
			}else if(i!=num) {
				//첫번째 라인과 마지막 라인을 제외한 나머지 라인 
				
				//왼쪽 별 
				System.out.print("*");
				
				//가운데 공백 
				for(int j=0;j<count;j++)
					System.out.print(" ");
				
				//오른쪽별 
				System.out.print("*");
				count +=2;
			}
			else {
				count +=2;
				//마지막 라인 별 : 1->3->5->7->9
				for(int j=0;j<count;j++) 
					System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}
