package datastructure;


/**
 ******* Queue *********
 *: An ordered list in which all insertions take place at one end (rear) 
 * and all deletions take place at the opposite end (front)
 * 
 * - FIFO (First in First out)
 * 
 * - Main queue operation
 * 1. add (Object)
 * 2. remove ()
 * 
 * 변수 : rear, front 필요
 * 1. rear : 움직이는 index -- > 항상 배열의 마지막 요소를 가리킬 수 있도록!
 * 2. front : 항상 배열의 첫번째 요소를 가리킬 수 있도
 * 
 * 
 ******* Circular Queue ********* 
 * 
 * */
public interface Queue {
	
	void add(Object o);
	Object deQueue();
	void delete();
	
	boolean isEmpty();
	boolean isFull();
	
	
}
