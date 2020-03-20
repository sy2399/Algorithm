package datastructure;

/**
 * Array로 Stack 구현
 * 
 * - 생성자에 stack size 를 parameter 로 넘겨줘야 함.
 * - stack 배열
 * - top : index 나타낼 변수
 * - stackSize : stack 의 크기
 *  
 * **/
public class StackArray implements Stack{

	private char[] stackItem;
	int top;
	int stackSize;
	
	public StackArray(int size) {
		super();
		
 		this.top = -1; // -1 = stack 이 비어있음을 의미 --> stack 에 요소를 넣을 때 index 가 0 부터 시작하도
 		this.stackSize = size;
 		this.stackItem = new char[this.stackSize];
	}


	@Override
	public boolean isEmpty() {
		//top 변수가 -1인지 --> -1이면 stack 이 비어있
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		//top 변수와 stackSize 비교
		//stackSize-1 : 배열의 마지막 index
		return (top == stackSize-1);
	}

	@Override
	public void push(char item) {
		if (!isFull()) {
			stackItem[++top] = item; 
			System.out.println("push :" +top);
		}
		else
			System.out.println("Stack is full!");
	}

	@Override
	public char pop() {
		if(!isEmpty()) {
			System.out.println("pop :" +top);

			return stackItem[top--];
		}
		else
			System.out.println("Stack is empty!");
			return 0;
	}

	
	/*
	 * pop() vs peek()
	 * - pop() : return stack[top--]
	 * - peek() : return stak[top]
	 * 
	 * --> top 변수를 (index) 를 이동시키냐 안시키냐의 차
	 */
	@Override
	public char peek() {
		if(!isEmpty())
			return stackItem[top];
		else
			System.out.println("Stack is empty!");
			return 0;
	}
	

	
	public void printAll() {
		System.out.println("<<STACK>>");
		for(int i=top;i>-1;i--) {
			System.out.println(i + ":" + stackItem[i]);
		}
		
	}
	
	public static void main(String[] args) {
		//size of stack = 5
		StackArray stack = new StackArray(5);
		stack.push('A');
		stack.push('B');
		stack.push('C');
		
		stack.printAll();
		
		stack.pop();
		stack.pop();
		stack.printAll();
		
	}

}
