package Lists;

public class MyStringLinkedList {

	Node header;
	

	MyStringLinkedList() {
		header = null;
		
	}

	public void addSort(String item) {
		// Implement

		// If the list is empty
				if (header == null) {
					header = new Node(null, item, null);
				} else
				// Check if the item is less than the header
				if (header.value.compareTo(item) > 0) {
					Node newNode = new Node(null, item, header);
					header = newNode;
				} else {
					// Finding the correct position to insert a node
					Node current = header;
					Node previous = null;
					while (current != null && item.compareTo(current.value) > 0) {
						previous = current;
						current = current.next;
					}
					// Inserting node in the end
					if (current == null) {
						previous.next = new Node(previous, item, null);
					} else // Node to be insert in between previous and next
					{
						Node n = new Node(previous, item, current);
						previous.next = n;
						current.previous = n;
					}
				}

	} // insert in a Sorted Order

	public int size() {
		// Implement
		Node temp = header;
		int count = 0;

		while (temp != null) {

			count++;
			temp = temp.next;
		}
		
		return count;
	}

	public boolean isEmpty() {
		// Implement
		if (header == null)
			return true;
	
		return false;
	}

	public Node getFirst() {
		// Implement
	
			return header;
		
	}

	public Node getLast() {
		// Implement
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean contains(String item) {
		// Implement

		Node temp = header;

		while (temp != null) {

			if (temp.value.equals(item))
				return true;
		}
		
		return false;
	}

	public void removeFirst() {
		// Implement
		if (header.next == null) {
			return;
		} else {
			Node temp = header.next;
			header.next = null;
			header = temp;
		}

	}

	void removeLast() {
		// Implement
		Node last = getLast();
		if (last.previous != null) {
			last.previous.next = null;
		}
		return;

	}

	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		//base case
		if(n == null) return ;

			System.out.println(n.value);

		
		print(n.next);

	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods

		mySL.addSort("Godfrey");
		mySL.addSort("Julz");
		mySL.addSort("Emma");
		mySL.addSort("Keddy");
		mySL.addSort("Abel");
		mySL.addSort("Billy");
		// mySL.print();

		//mySL.removeLast();
		//mySL.removeFirst();
		
		//Print the 
		//System.out.println(mySL.getFirst());
		//System.out.println(mySL.getLast());
		System.out.println(mySL);
		
		
		//Print Size of List.
		System.out.println(mySL.size());
		
		

	}

}
