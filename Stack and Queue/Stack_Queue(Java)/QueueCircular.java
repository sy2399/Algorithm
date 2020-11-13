package datastructure;

public class QueueCircular implements Queue{
	    private int front;
	    private int rear;
	    private int queueSize;
	    private char ItemArray[];
	 
	    public QueueCircular(int queueSize) {
	        this.front = 0;
	        this.rear = 0;
	        this.queueSize = queueSize;
	        ItemArray = new char[queueSize];
	    }
	 
	    //큐가 비어있는지 확인
	    @Override
	    public boolean isEmpty() {
	        return (front==rear);
	    }
	 
	    //큐가 가득차 있는지 확인
	    public boolean isFull() {
	        return ((rear+1)%this.queueSize==front);
	    }
	 
	    //큐의 삽입 연산
	    @Override
	    public void add(Object item) {
	        if(isFull()){
	            System.out.println("큐가 포화 상태");
	        }else{
	            rear = (rear+1)%(queueSize);
	            ItemArray[rear] = (char) item; 
	        }
	    }
	 
	    //큐의 삭제 후 반환 연산
	    @Override
	    public Object deQueue() {
	        if(isEmpty()){
	            System.out.println("큐가 공백 상태");
	            return 0;
	        }else{
	            front = (front+1)%queueSize;
	            return ItemArray[front];
	        }
	    }
	 
	    //큐의 삭제 연산
	    @Override
	    public void delete() {
	        if(isEmpty()){
	            System.out.println("삭제할 큐가 없음");
	        }else{
	            front = (front+1)%queueSize;
	        }
	    }
	 
	    //큐의 현재 front값 출력
	    
	    public char peek() {
	        if(isEmpty()){
	            System.out.println("큐가 비어있음");
	            return 0;
	        }else{
	            return ItemArray[(front+1)%queueSize];
	        }
	    }
	 
	    //전체 큐값 출력
	    public void prinAll(){
	        if(isEmpty()){
	            System.out.println("큐가 비어있음");
	        }else{
	            int f = front;
	            
	            while(f!=rear){
	                f = (f+1)%queueSize;
	                System.out.print(ItemArray[f] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	
	
}
