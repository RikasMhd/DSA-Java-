public class QueueLinkedListADT {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
     
    Node rear;
    Node front;

    QueueLinkedListADT(){
        rear=null;
        front=null;
    }
    boolean isEmpty(){
        return rear==null;
    }

    void enQueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            front=rear=newNode;
            return ;
        }
        rear.next=newNode;
        rear=newNode;
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        front=front.next;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return front.data;
    }

    void show(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return ;
        }
        Node current=front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedListADT queue= new QueueLinkedListADT();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.show();

        queue.deQueue();
        queue.show();

        System.out.println(queue.peek());
    }
}
