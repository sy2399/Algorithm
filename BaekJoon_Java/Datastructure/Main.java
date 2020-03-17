//package datastructure;
//import java.util.Scanner;
//
//public class Main{
//
//	static int[] stackItem;
//	static int top;
//	static int stackSize;
//	
////	public Main(int size) {
////		super();
////		
//// 		this.top = -1; // -1 = stack 이 비어있음을 의미 --> stack 에 요소를 넣을 때 index 가 0 부터 시작하도
//// 		this.stackSize = size;
//// 		this.stackItem = new int[this.stackSize];
////	}
//
//
//	public static boolean isEmpty() {
//		//top 변수가 -1인지 --> -1이면 stack 이 비어있
//		return (top == -1);
//	}
//
//
//	public static boolean isFull() {
//		//top 변수와 stackSize 비교
//		//stackSize-1 : 배열의 마지막 index
//		return (top == stackSize-1);
//	}
//
//
//	public static void push(int item) {
//		if (!isFull()) {
//			stackItem[++top] = item; 
////			System.out.println("push :" +top);
//		}
//		else
//			System.out.println("Stack is full!");
//	}
//
//
//	public static int pop() {
//		if(!isEmpty()) {
////			System.out.println("pop :" +top);
//
//			return stackItem[top--];
//		}
//		else
////			System.out.println("Stack is empty!");
//			return -1;
//	}
//	
//	public static int size() {
//		return top;
//	}
//	
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		comment = sc.nextInt();
//        stackItem =  new int[100];
//        
//        for(int i=0;i<)
//        String input = sc.next();
//        
//        if (input.contains("push")){
//        	
//            int item = sc.nextInt();
//            push(item);
//        }
//        
//        if(input == "pop") {
//        	System.out.println(pop());
//        	
//        }else if( input == "size") {
//        	System.out.println(size());
//        	
//        }else if( input == "empty") {
//        	System.out.println(isEmpty());
//        	
//        }else if( input == "top") {
//        	System.out.println(stackItem[top]);
//        }
//        		
//		
//	}
//
//}
