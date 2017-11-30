import java.io.PrintStream;
import java.util.NoSuchElementException;

/*
 * Test file
 * Domes 2014 - Ergasia 1
 * 
 */

public class TestFile {
	
	private static PrintStream ps = System.out;

	public static void main(String[] args) {
		
		/***** PART A *****/
		
		ps.println("***** IntQueue Testing *****");
		ps.println();
		
		// create a queue
		IntQueueImpl q = new IntQueueImpl("TestQueue");
		ps.println("Created " + q.name);
		
		// test if exception is caught
		try {
			q.get();
		} catch (NoSuchElementException e) {
			ps.println("Nice, NoSuchElementException caught properly!");
		}
		ps.println();
		
		// put some elements in the queue
		int k = 10;
		ps.println("Populating " + q.name + " with " + k + " elements:");
		if (q.isEmpty()) {
			for (int i = 0; i < k; i++) {
				q.put(i * i);
				q.printQueue(ps);
			}
		}
		ps.println(q.name + " size is " + q.size());
		ps.println();
		
		// use peek to get oldest element without removing from the queue
		int a = q.peek();
		ps.println("Oldest element in " + q.name + " is " + a);
		q.printQueue(ps);
		ps.println(q.name + " remains unchanged after peek()!");
		ps.println();

		// Remove elements from the queue
		while (!q.isEmpty()) {
			ps.println("Removing oldest = " + q.get());
			q.printQueue(ps);
		}
		ps.println();
		
		ps.println(q.name + " size is " + q.size());
		ps.println();
	}
}