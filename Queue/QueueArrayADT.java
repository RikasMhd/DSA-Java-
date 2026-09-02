public class QueueArrayADT {
    int queue [];
    int size;
    int front;
    int rear;

    QueueArrayADT(int size){
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=-1;
    }
    boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    boolean isFull(){
        return rear==size-1;
    }

    void enQueue(int data){
        if(isEmpty()){
            front++;
            rear++;
            queue[rear]=data;
            return ;
        } 
        if(isFull()){
            System.out.println("Queue is Full!. You can't Insert.");
            return ;
        }
        rear++;
        queue[rear]=data;
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        
        int temp=queue[front];
        front++;
        return temp;

    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }


    void show(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return ;
        }
        
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        QueueArrayADT queue= new QueueArrayADT(5);
        System.out.println("Array is Empty? "+queue.isEmpty());
        System.out.println("Array is Full? "+queue.isFull());

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.show();

        queue.deQueue();
        queue.deQueue();
        queue.show();
        
        System.out.println("Peek Data: "+queue.peek());
        queue.show();
    }
}
