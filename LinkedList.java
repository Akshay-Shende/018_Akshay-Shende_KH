//Linked List

class LinkedList{
static Node head;
static class Node{
int data;
Node next;
	Node(int d){
	data =d;
	next = null;
	}
	}
	
void addNode(int x){
	Node newNode = new Node(x);
	Node n  =head;
	while(n.next!= null){
		n = n.next;
	}
	n.next = newNode;
}


Node reverse(Node node){
Node prev =null;
Node current = node;
Node next = null;

while(current!=null){
next = current.next;
current.next = prev;
prev = current;
current = next;
}
node = prev;
return node;
}

void printList(Node node){
while(node!=null){
System.out.print(node.data+" ");
node = node.next;
}
}

public static void main (String args[]){
	LinkedList ll = new LinkedList();
	ll.head = new Node(1);
	Node first = new Node(5);
	
	head.next = first;
	ll.addNode(1);
	ll.addNode(2);
	ll.addNode(3);
	ll.addNode(4);
	ll.addNode(5);
	ll.reverse(head.next.next.next.next);
	ll.printList(head);
	
}
}