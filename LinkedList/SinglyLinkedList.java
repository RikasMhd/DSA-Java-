class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListADT{
    Node head;

    LinkedListADT(){
        this.head=null;
    }

    boolean isEmpty(){
        return head==null;
    }

    void insertBeginning(int data){
        Node newNode = new Node(data);
        
        if(isEmpty()){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }        
    }

	void insertAtPosition(int index,int data){		
		if(index<1){
			System.out.println("Invalid Index");
			return ;
		}
		
		Node newNode=new Node(data);
		Node current=head;

		for(int i=1;i<index-1;i++){
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
	}

	void insertAtEnd(int data){
		Node newNode=new Node(data);
		if(isEmpty()){
			head=newNode;
		}
		else{
			Node current=head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=newNode;
		}
	}

	void deleteAtFront(){
		if(isEmpty()){
			System.out.println("Array List is Empty");
		}
		else{
			head=head.next;
		}
	}

	void deleteAtEnd(){
		if(isEmpty()){
			System.out.println("Array List is Empty");
			return ;
		}
		
		Node current=head;
		while(current.next.next!=null){
			current=current.next;
		}
		current.next=null;
		
	}

	void deleteAtPosition(int index){
		if(index<0){
			System.out.println("Invalid Index");
			return ;
		}

		Node current=head;
		for(int i=1;i<index-1;i++){
			current=current.next;
		}
		current.next=current.next.next;
	}

	void deleteData(int data){
		if (isEmpty()) {
			System.out.println("Linked list is empty");
			return;
    	}

		if(data==head.data){
			head=head.next;
			return ;
		}
		Node current=head;

		while(current.next!=null && current.next.data!=data){
			current=current.next;
		}
		if(current.next==null){
			System.out.println("Data not found!");
		}
		current.next=current.next.next;
	}

	void search(int data){
		if(isEmpty()){
			System.out.println("Linked list is empty");
			return ;
		}

		Node current=head;
		while(current!=null){
			if(current.data==data){
				System.out.println("Data is found ");
				return ;
			}
			current=current.next;
		}
		System.out.println("Data not found");
		
	}

	void reverse(){
		Node prev=null;
		Node current=head;
		Node next=null;

		while(current!=null){
			next=current.next;
			current.next=prev;		//reversing the pointer
			prev=current;
			current=next;
		}
		head=prev;
	}
    void display(){
        if(isEmpty()){
            System.out.print("LinkedList is Empty.");
        }
        else{
            Node current=head;
            while(current!=null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        
    }
}

public class SinglyLinkedList{
    public static void main(String [] args){
        LinkedListADT list=new LinkedListADT();

		System.out.println("After INSERTING Elements At Front");
        list.insertBeginning(5);
		list.insertAtEnd(3);
        list.insertBeginning(7);
		list.insertBeginning(9);
		list.display();
		System.out.println();

		System.out.println("After INSERTING Elements At End");
        list.insertAtEnd(19);
		list.display();
		System.out.println();

		System.out.println("After DELETING Element At Front");
		list.deleteAtFront();
		list.display();
		System.out.println();

		System.out.println("After INSERTING Elements At Position");
		list.insertAtPosition(2,10);
		list.insertAtPosition(5,2);
		list.insertAtPosition(6,6);
		list.display();
		System.out.println();

		System.out.println("After DELETING Element At End");
        list.deleteAtEnd();
		list.display();
		System.out.println();
        
		System.out.println("After DELETING Element At Position");
		list.deleteAtPosition(3);
		list.display();
		System.out.println();

		System.out.println("After DELETING Element By that Data");
		list.deleteData(6);
		list.display();
		System.out.println();

		System.out.println("Finding an Element");
		list.search(10);
		list.search(21);
		System.out.println();

		System.out.println("After the REVERSE");
		list.reverse();
		list.display();

    }
}
