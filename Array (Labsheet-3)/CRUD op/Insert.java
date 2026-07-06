public class Insert {

    int size, capacity;
    int[] arr;

    // Constructor
    public Insert(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    // Insert Method
    public void insert(int index, int element) {

        // Check if array is full
        if (size == capacity) {
            System.out.println("Array is Full");
            return;
        }

        // Check for invalid index
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }

        // Shift elements to the right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert new element
        arr[index] = element;
        size++;
    }

    // Display array
    public void show() {
        System.out.print("Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        Insert i1 = new Insert(5);

        
        System.out.println("Insert 10 at index 0");
        i1.insert(0, 10);
        i1.show();

        System.out.println("Insert 20 at index 1");
        i1.insert(1, 20);
        i1.show();

        System.out.println("Insert 15 at index 1");
        i1.insert(1, 15);
        i1.show();

        System.out.println("Insert 25 at index 3");
        i1.insert(3, 25);
        i1.show();

        System.out.println("Insert 30 at index 4");
        i1.insert(4, 30);
        i1.show();

        System.out.println("Try to insert into full array");
        i1.insert(2, 40);

        System.out.println("Try invalid index");
        i1.insert(7, 50);
    }
}