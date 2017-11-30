/*
* ListNode.java
*
*/

// class to represent one node in a list
class ListNode
{
	// package access members; List can access these directly
	int data;
	ListNode nextNode;

	// constructor creates a ListNode that refers to object
	ListNode( int object )
	{
		this( object, null );
	} // end ListNode one-argument constructor

	// constructor creates ListNode that refers to
	// Object and to next ListNode
	ListNode( int object, ListNode node )
	{
		data = object;
		nextNode = node;
	} // end ListNode two-argument constructor

	// return reference to data in node
	int getObject()
	{
		return data; // return Object in this node
	} // end method getObject

	// return reference to next node in list
	ListNode getNext()
	{
		return nextNode; // get next node
	} // end method getNext
	void printer(){
	System.out.println("the value is"+getObject());}
} // end class ListNode