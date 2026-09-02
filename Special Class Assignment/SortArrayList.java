public class SortArrayList {

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

        void sortAscending() {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        void sortDescending() {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(3);
        list.add(99);
        list.add(23);

        System.out.print("Before sorting: ");
        list.print();

        list.sortAscending();
        System.out.print("Ascending order: ");
        list.print();

        list.sortDescending();
        System.out.print("Descending order: ");
        list.print();
    }
}