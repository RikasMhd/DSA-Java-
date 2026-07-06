public class DynamicArray {

    int size, capacity;
    int[] arr;

    // Constructor
    public DynamicArray(int capacity) {
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

        if(size>= capacity){
            resize();
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

    public void delete(int index){
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

        for(int i=index; i<size; i++){
            arr[i]=arr[i+1];
        }
        size--;
        
    }

    public void resize(){
        int newCapacity=capacity*2;     //or capacity*=capacity;
        int[] newArr=new int[newCapacity];
        for(int i=0; i<size; i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
        capacity=newCapacity;
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

        DynamicArray arr1 = new DynamicArray(5);
        
        System.out.println("Before Delete index 2");
        arr1.insert(0, 10);
        arr1.insert(1, 20);
        arr1.insert(2, 30);
        arr1.insert(3, 40);
        arr1.show();

        arr1.delete(2);
        System.out.println("After Delete index 2");
        arr1.show();

        arr1.insert(2,55);
        arr1.show();

    }
}