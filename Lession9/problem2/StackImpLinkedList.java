package queue;


interface Stack1 {
	public void push(Object ob);

	public Object pop();

	public Object peek();

	public boolean isEmpty();

	public int size();
}
public class StackImpLinkedList {

	Node top;

	class Node {
		int data;
		Node link;
	}

	StackImpLinkedList() {

		this.top = null;
	}

	public void push(int item) // add an item on top of stack
	{
		Node temp = new Node();

		if (temp == null) {
			System.out.println("The stack is full");
			return;
	}
		
			temp.data = item;
			temp.link = top;
			top = temp;
		

	}

	public void pop() // remove an item from top of stack
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return ;
		}
		top = top.link;
		
	}

	public int peek() // get top item of stack
	{
		if (isEmpty())
			return 0;
		return top.data;
	}

	public boolean isEmpty() // true if stack is empty
	{
		if (top == null)
			return true;
		return false;
	}

	public int size() // returns number of items in the stack
	{
		int count = 0;
		if (top == null) {
			return 0;
		} else {
			Node newNode = top;
			while (newNode != null) {
				count++;
				newNode = newNode.link;

			}

		}
		return count;
	}
}


