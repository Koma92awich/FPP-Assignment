package queue;

import java.util.Arrays;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		// return -1;
		// implement
		if(isEmpty())
			return -1;
		
		return arr[front];
	}

	public void enqueue(int obj) {
		// implement
		if(front == -1)
			front++;
		if (arr.length == rear) 
			System.out.println("The Queue is full");
			
		 resize();
			arr[rear] = obj;
			rear++;
		
		return;
	}

	public int dequeue() {
		// return -1;
		// implement
		if (front == -1) {
			System.out.println("QUEUE IS EMPTY");
			return 0;
		} else {
			int temp = arr[front];

			front++;
			return temp;
		}
	}

	public boolean isEmpty() {
		// implement
		if (front == -1 || front > rear)
			return true;
		return false;
	}

	public int size() {
		// implement
		int i, count = 0;
		
		if (front == -1 || front > rear) { 
			
			return count;
		} else {

		// traverse front to rear and print elements 
		for (i = front; i < rear; i++) { 
			count++; 
		} 
		return count;
		}
	}

	private void resize() {
		// implement
		int temp [] = new int[arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr =temp;
	}

}
