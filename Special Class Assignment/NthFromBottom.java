public class NthFromBottom {

    static class Stack {
        int[] arr;
        int top;
        int capacity;

        Stack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack overflow");
                return;
            }
            arr[++top] = x;
        }

        int size() {
            return top + 1;
        }

        int getFromBottom(int n) {
            if (n < 0 || n >= size()) {
                return -1;
            }
            return arr[n];
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int n = 2; 

        int result = st.getFromBottom(n);
        if (result == -1) {
            System.out.println("Invalid position");
        } else {
            System.out.println(n + "th element from bottom is: " + result);
        }
    }
}