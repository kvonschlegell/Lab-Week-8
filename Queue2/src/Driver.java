
public class Driver {

	public static void main(String[] args) {
		LinkedQueue linkQ = new LinkedQueue();
		ArrayQ arrayQ = new ArrayQ();

		linkQ.enqueue(1);
		linkQ.enqueue(7);
		linkQ.enqueue(3);
		linkQ.enqueue(4);
		linkQ.enqueue(9);
		linkQ.enqueue(2);

		for (int i = 0; i < 6; i++) {
			System.out.println("Dequeue from link: " + linkQ.dequeue());
		}

		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);

		for (int i = 0; i < 6; i++) {
			System.out.println("Dequeue from array: " + arrayQ.dequeue());
		}

		linkQ.enqueue(2);
		linkQ.enqueue(9);
		linkQ.enqueue(1);
		linkQ.enqueue(4);
		// linkQ.enqueue(8);

		linkQ.removeMiddle();

		/*
		 * Exercise 3
		 *  a. 50 
		 *  b. 9, 14, 19, 67, 76
		 *  c. 23, 17, 50 
		 *  d. 9, 14, 12, 19, 23, 17, 67, 54, 76, 72, 50
		 */

		

	}

}
