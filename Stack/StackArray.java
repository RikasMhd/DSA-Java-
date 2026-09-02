public class StackArray {
    int size;
    int stack[];
    int top;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    int push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return -1;
        }
        top++;
        stack[top] = data;
        return data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int data = stack[top];
        top--;
        return data;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    void binary(int decimal) {
        if (decimal == 0) {
            System.out.println("Binary: 0");
            return;
        }

        while (decimal > 0) {
            int rem = decimal % 2;
            push(rem);
            decimal = decimal / 2;
        }

        System.out.print("Binary: ");

        while(!isEmpty()) {
            System.out.print(pop());
        }
        System.out.println();
    }

    void show() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return ;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray s= new StackArray(100);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Stack after PUSH:");
        s.show();

        System.out.println("Popped element: " +s.pop());
        System.out.println();

        System.out.println("Stack after POP:");
        s.show();

        System.out.println("Is Stack Empty? " +s.isEmpty());
        
        System.out.println("Is Stack Full? " +s.isFull());

        System.out.println("Top element: " +s.peek());

        System.out.println("Binary Value for 10:");
        StackArray binaryStack = new StackArray(100);
        binaryStack.binary(10);
    }
}