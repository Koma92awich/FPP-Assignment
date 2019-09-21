package queue;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StackImpLinkedList stk = new StackImpLinkedList(); // create stack of size 4
//		int item;
//		stk.push(40); // push 3 items onto stack
//		stk.push(30);
//		stk.push(20);
//		stk.push(10);
//		
//		System.out.println("size(): "+ stk.size());
//		//stk.pop(); // delete item
//		//System.out.println(item + " is deleted");
//		stk.push(50); // add three more items to the stack
//		stk.push(60);
//		//System.out.println(stk.pop() + " is deleted");
//		stk.push(70); // push one item
//		item = stk.peek(); // get top item from the stack
//		System.out.println(item + " is on top of stack");
//		System.out.println("Size of the Stack : " + stk.size());
		
		
		ArrayQueueImpl q = new ArrayQueueImpl();
  System.out.println(	q.peek());
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		System.out.println(	q.peek());
		for(int i = 0; i < 15; i ++)
			q.dequeue();
		System.out.println(q.size());
	}

}
