public class SubListExample {

    static class ArrayList {
        int[] arr;
        int size;
        int capacity;

        ArrayList(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            size = 0;
        }

        void add(int x) {
            if (size == capacity) {
                System.out.println("List is full");
                return;
            }
            arr[size++] = x;
        }

        void print() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // returns a new ArrayList containing elements from start to end-1
        ArrayList extractSubList(int start, int end) {
            if (start < 0 || end > size || start > end) {
                System.out.println("Invalid range");
                return null;
            }
            ArrayList sub = new ArrayList(end - start);
            for (int i = start; i < end; i++) {
                sub.add(arr[i]);
            }
            return sub;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.print("Original list: ");
        list.print();

        int start = 2;
        int end = 5; // exclusive, so it picks index 2,3,4

        ArrayList sub = list.extractSubList(start, end);

        System.out.print("Sub list from index " + start + " to " + (end - 1) + ": ");
        sub.print();
    }
}