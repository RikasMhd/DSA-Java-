public class Search {
    int size, capacity;
    int[] arr;

    // Constructor
    public Search(int capacity) {
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

    public int get(int index){
        if(index<0 || index>=size){
            System.out.println("Invalid Index");
            return -9999999;
        }
        return arr[index];
    }

    public void set(int index, int element){
        if(index < 0 || index>=size){
            System.out.println("Invalid Index");
        }
        arr[index]=element;
    }
	
	
    // public int search(int element){
        // for(int i=0 ; i<size ; i++ ){
            // if(arr[i]==element){
                // return i;
            // }
            
        // }
        // return -1;
    // }
	
	
	//Using Recursive
	public int searchRec(int element,int i){
		if(arr.length==0){
			System.out.println("Array is Full");
			return -1;
		}
		if(i<size){
			System.out.println("Element Not Found.");
			return -1;
		}
		if(element==arr[i]){
			return i;
		}
		return searchRec(element,i+1);
		
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

        Search arr1 = new Search(5);

        arr1.insert(0,5);
        arr1.insert(1,4);
        arr1.insert(2,6);
		arr1.insert(3,9);
		arr1.insert(4,1);
        arr1.show();
        
        System.out.println("Get 0 index Element in array: "+arr1.get(0));
        arr1.set(2,8);
        arr1.show();

        // System.out.println("Find index of 5: "+arr1.search(4));
        // System.out.println("Find index of 10: "+arr1.search(10));
		
		System.out.println("Find Element 5 in index 0 : "+arr1.searchRec(5,0));
		System.out.println("Find Element 9 in index 3 : "+arr1.searchRec(9,3));


    }
}
