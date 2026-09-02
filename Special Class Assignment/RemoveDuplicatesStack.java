public class RemoveDuplicatesStack {

    static class Stack {
        int[] arr;
        int top;
        int size;

        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        boolean isEmpty() {
            return top == -1;
        }

        void push(int data) {
            if (top == size - 1) {
                System.out.println("Stack overflow");
                return;
            }
            top++;
            arr[top] = data;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[top--];
        }

        void print() {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(5);
        st.push(3);
        st.push(5);
        st.push(8);
        st.push(3);
        st.push(9);

        System.out.print("Original stack: ");
        st.print();

        Stack temp = new Stack(10);
        boolean[] seen = new boolean[100]; 

        while (!st.isEmpty()) {
            int val = st.pop();
            if (!seen[val]) {
                seen[val] = true;
                temp.push(val);
            }
        }

        
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.print("After removing duplicates: ");
        st.print();
    }
}