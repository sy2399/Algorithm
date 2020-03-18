package datastructure;
/**
 * Stack :  An ordered list in which insertions and deletions are made at one end called the top
 * 
 * - Last-In-First-Out ( LIFO )
 * 
 * - Main stack operation
 * 1. push(Object o) : 주어진 객체를 stack 에 넣는다 
 * 2. pop() :가장 상위 객체를 가져온다. (객체를 stack 에서 제거)
 * 3. peek() : 가장 상위 객체를 읽는다. (객체를 stack 에서 제거하지 않는다)
 * 
 * cf. top(), size(), empty(), search()
 * 
 * - Array, LinkedList 로 구현 가능 
 *  
 * **/


// Stack Interface -- Define function
public interface Stack {
	
    boolean isEmpty();
    boolean isFull();
    
    void push(char item);
    char pop();
   
    char peek();
    
    
    
}
