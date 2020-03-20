package datastructure;

public class QueueArray implements Queue{
	
	char[] queueItem;
	int queueSize;
			
	int front, rear = -1;
	

	
	public QueueArray(int size) {
		super();
		this.queueSize = size;
		this.queueItem = new char[queueSize];
	}

	@Override
	public void add(Object o) {
		if(!isFull()) {
			queueItem[++rear] = (char) o;
		}else {
			System.out.println("Queue is Full");
		}	
	}

	//큐의 삭제 및 반환 연산
    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("큐가 비었습니다.");
            return 0;
        }else{
            return queueItem[++front];
        }
    }
 
    //큐 삭제
    @Override
    public void delete() {
        if(isEmpty()){
            System.out.println("큐가 비었습니다.");
        }else{
            ++front;
        }
    }   



	@Override
	public boolean isEmpty() {
		if(rear == front)
			return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		if(rear == queueSize-1)
			return true;
		else
			return false;
	}
	
	public void printAll() {
		System.out.println("-----QUEUE------");
		for(int i=front;i<=rear;i++) {
			System.out.println(i + " " + queueItem[i]);
		}
	}
	
	public static void main(String[] args) {
		
		QueueArray queue = new QueueArray(5);
		
		queue.add('A');
		queue.add('B');
		
		queue.printAll();
		
		queue.deQueue();
				
		queue.printAll();
	}

}
