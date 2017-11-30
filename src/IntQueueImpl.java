import java.io.PrintStream;
import java.util.*;
public class IntQueueImpl implements IntQueue {
	 ListNode firstNode;
	 ListNode lastNode;
	 String name; // string like "list" used in printing

	// constructor creates empty List with "listName" as the name
	public IntQueueImpl()
	{
		this("Queue");
	} // end List no-argument constructor

	// constructor creates an empty List with a name
	public IntQueueImpl( String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	} // end List one-argument constructor

	/**
	 * Insert an integer to the queue
	 * @param item the element to be inserted
	 */
	public void put(int item) //instert at back
		{
		
		ListNode node =new ListNode(item);
		if (isEmpty())
		firstNode=lastNode=node;
		else{
			lastNode = lastNode.nextNode = new ListNode( item );//lastNode.nextNode = node;
																	//lastNode = node;
		}
		
	}

	/**
	 * Remove and return the oldest item of the queue
	 * @return The item removed
	 * @exception NoSuchElementException if the queue is empty
	 */
	public int  get() throws NoSuchElementException//remove from front//
	{
		if(isEmpty())
			throw new NoSuchElementException();
		
		int removeditem=firstNode.data;
		if (firstNode==lastNode)
			firstNode=lastNode=null;
		else
			firstNode=firstNode.nextNode;
		
		return removeditem;
		
	}

	/**
	 * Return without removing the oldest item of the queue
	 * @return The oldest item of the queue
	 * @exception NoSuchElementException if the queue is empty
	 */
	public int peek() throws NoSuchElementException{
		if (isEmpty())
			throw new NoSuchElementException();
		
		int peekelement =firstNode.data;
		
			return peekelement;
	}  
	/**
	 * Print the elements of the queue, starting from the oldest item, to the
	 * print stream given as argument. For example, pass System.out as parameter
	 * for standard output
	 * @param stream The printstream where we want to print
	 */
	public void printQueue(PrintStream stream){
		if ( isEmpty() )
		{
		stream.printf( "Empty %s\n", name );
			return;
		} // end if

		stream.printf( "The %s is: ", name );
		ListNode current = firstNode;

		// while not at end of list, output current node's data
		while ( current != null )
		{
			stream.printf( "%s ", current.data );
			current = current.nextNode;
		} // end while

		stream.println( "\n" );
	}
	

	/**
	 * Return the size of the queue, 0 if it is empty
	 * @return Number of elements in the queue
	 */
	
	public int size(){
		int x=1;
		if (isEmpty())
			return 0;
		else{
		
		
		ListNode current=firstNode;
		
		while(current.nextNode!=null){
			current=current.nextNode;
			x++;}//xekiname apo 1
		
		}
		return x;
	
}
	/**
	 * Check if the queue is empty
	 * @return true if the queue is empty
	 */
public boolean isEmpty(){
		
		return (firstNode==null);
	}








}
