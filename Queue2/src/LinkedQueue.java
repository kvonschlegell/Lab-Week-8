
public class LinkedQueue {
	LinkedNode front;
	LinkedNode rear;
	int count;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	void removeMiddle() {
		int half = size() / 2;
		if (count % 2 == 0) {
			half = half - 1;
		}
		LinkedNode current = front;
		LinkedNode previous = null;
		int count = 0;
		// once the half is found it is removed from the queue
		while (current != null) {
			if (count == half) {
				// once middle is element is removed breaking out of loop
				previous.next = current.next;
				break;
			}
			// keeping track of of numbers through the queue
			previous = current;
			current = current.next;
			count++;
		}
		System.out.println(toString());
	}

}
