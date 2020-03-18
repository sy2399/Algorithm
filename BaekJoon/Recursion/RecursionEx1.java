package Recursion;

/**
 * 
 * 문자배열이 주어지면, 주어진 문자로 만들수 있는 모든 문자배열 조합을 프린트 하시오.
 * Given a string, print all permutations of characters in the string.
 * 
 * input: ABC
 * output: ABC ACB BAC BCA CBA CAB
 * 
 * 출처 : 매일프로그래 https://mailprogramming.com/sample_question_recursion
 */
public class RecursionEx1 {
	
	public static void main(String[] args) {
		
		String str = "ABC";
		System.out.println("Permutations of characters in the string " + str );

		permutation(str, 0, str.length()-1); // 0번째 문자를 고정, 나머지 문자를 섞어라.

	}
	
	public static void permutation(String str, int startIdx, int endIdx) {
		System.out.println("Str : "+ str + ", startIdx : "+ startIdx + ", endIdx: "+endIdx );
		int len = str.length();
		
		if(startIdx == endIdx) {
			System.out.println("If문 --"+ str);
			
		}else {
			for(int i = startIdx; i<=endIdx; i++) {
				System.out.println("I : " + i);
				str = swap(str, startIdx, i);
				System.out.println("-----1st swap------");
				permutation(str, startIdx+1, endIdx);
				System.out.println("Permutation");
				str = swap(str, startIdx, i);
				System.out.println("-----2nd swap------");
				
			}	
			
		}
		System.out.println("******");
		
	}
	
	public static String swap(String str, int i, int j) {
		
		System.out.println("Swap : "+ str + " " + i + " " +j);
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j, str.charAt(i));
		
		return sb.toString();		
		
	}

}
