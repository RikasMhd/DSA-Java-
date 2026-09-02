public class StackLinkedListADT {
    class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }

}
    Node top;
    StackLinkedListADT(){
        top=null;
    }

    boolean isEmpty(){
        return top==null;
    }

    void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    void show(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return ;
        }
        Node current=top;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        StackLinkedListADT s=new StackLinkedListADT();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println("Stack after PUSH: ");
        s.show();

        System.out.println("Popped element: "+s.pop()+" and "+s.pop());
        System.out.println("Stack after POP 2 Data's: ");
        s.show();

        System.out.println("Top element: " +s.peek());
    }
}
