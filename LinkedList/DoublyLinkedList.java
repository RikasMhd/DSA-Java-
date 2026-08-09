class DoublyLinkedListADT {
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedListADT() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
			return ;
        } 
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
			return ;
        } 
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
    }

    public void insertAtPosition(int data, int index) {
        if (index < 1 || index > getSize() + 1) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 1) {
            insertFront(data);
            return;
        }

        if (index == getSize() + 1) {
            insertEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Doubly linked list is empty!");
            return;
        }
        if (head == tail) {
            head = tail = null;
			return ;
        } 
		head = head.next;
		head.prev = null;
        
    }

    public void deleteEnd() {
        if (isEmpty()) {
            System.out.println("Doubly linked list is empty!");
            return;
        }
        if (head == tail) {
            head = tail = null;
			return ;
        }
		tail = tail.prev;
		tail.next = null;
        
    }

    public void deleteAtPosition(int index) {
        if (index < 1 || index > getSize()) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 1) {
            deleteFront();
            return;
        }

        if (index == getSize()) {
            deleteEnd();
            return;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public int search(int data) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }

        return -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Doubly linked list is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListADT list = new DoublyLinkedListADT();

        list.insertFront(7);
        list.insertFront(10);
        list.insertFront(5);
		list.display();

        list.insertEnd(20);
        list.insertEnd(25);
		list.display();

        list.insertAtPosition(15, 3);
		list.display();

		list.deleteEnd();
		list.display();

		list.deleteAtPosition(2);
		list.display();

		list.deleteFront();
		list.display();

		list.search(7);


		System.out.println("Size: " + list.getSize());
        System.out.println("Search 15: " + list.search(15));
    }
}

