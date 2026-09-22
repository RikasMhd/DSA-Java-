public class BTImplementation {
    int maxSize;
    char treeArr[]; // Changed from int to char
    int currSize;

    BTImplementation(int maxSize) {
        this.maxSize = maxSize;
        this.currSize = 0;
        treeArr = new char[maxSize];
    }

    boolean isEmpty() {
        return currSize == 0;
    }

    boolean isFull() {
        return currSize == maxSize;
    }

    // Changed parameter to char
    void insert(char data) {
        if (isFull()) {
            System.out.println("Tree Array is Full.");
            return;
        }
        treeArr[currSize] = data;
        currSize++;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Tree Array is Empty.");
            return;
        }
        for (int i = 0; i < currSize; i++) {
            System.out.print(treeArr[i] + " ");
        }
        System.out.println();
    }

    // --- Helper Method to find index of a character ---
    int findIndex(char data) {
        for (int i = 0; i < currSize; i++) {
            if (treeArr[i] == data) {
                return i;
            }
        }
        return -1; // Not found
    }

    // --- 1. Get the children of 'y' ---
    void getChildren(char data) {
        int index = findIndex(data);
        if (index == -1) {
            System.out.println("Node '" + data + "' not found.");
            return;
        }

        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        System.out.print("Children of '" + data + "': ");
        
        // Check left child
        if (leftIndex < currSize && treeArr[leftIndex] != '-') {
            System.out.print(treeArr[leftIndex] + " ");
        } else {
            System.out.print("null ");
        }

        // Check right child
        if (rightIndex < currSize && treeArr[rightIndex] != '-') {
            System.out.print(treeArr[rightIndex]);
        } else {
            System.out.print("null");
        }
        System.out.println();
    }

    // --- 2. Get the parent of 'r' ---
    void getParent(char data) {
        int index = findIndex(data);
        if (index == -1 || index == 0) {
            System.out.println("Node '" + data + "' has no parent or not found.");
            return;
        }

        int parentIndex = (index - 1) / 2;
        System.out.println("Parent of '" + data + "': " + treeArr[parentIndex]);
    }

    // --- 3. Set the right child of 'n' as 'o' ---
    void setRightChild(char parentData, char newData) {
        int index = findIndex(parentData);
        if (index == -1) {
            System.out.println("Parent node '" + parentData + "' not found.");
            return;
        }

        int rightIndex = 2 * index + 2;
        if (rightIndex < maxSize) {
            if (rightIndex >= currSize) {
                currSize = rightIndex + 1; // Expand current size if needed
            }
            treeArr[rightIndex] = newData;
            System.out.println("Set right child of '" + parentData + "' to '" + newData + "'.");
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // --- 4. Set the parent of 'y' as 'g' ---
    void setParent(char childData, char newParentData) {
        int index = findIndex(childData);
        if (index == -1 || index == 0) {
            System.out.println("Node '" + childData + "' has no parent or not found.");
            return;
        }

        int parentIndex = (index - 1) / 2;
        treeArr[parentIndex] = newParentData;
        System.out.println("Set parent of '" + childData + "' to '" + newParentData + "'.");
    }

    // --- 5. Find the height of the Tree ---
    int getHeight(int index) {
        if (index >= currSize || treeArr[index] == '-') {
            return 0; // Base case: empty node has height 0
        }
        
        int leftHeight = getHeight(2 * index + 1);
        int rightHeight = getHeight(2 * index + 2);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // --- 6. Find the size of the entire Tree ---
    int getSize(int index) {
        if (index >= currSize || treeArr[index] == '-') {
            return 0; // Base case: empty node counts as 0
        }
        
        return 1 + getSize(2 * index + 1) + getSize(2 * index + 2);
    }

    public static void main(String[] args) {
        // Increased size to accommodate the tree and potential new nodes
        BTImplementation t = new BTImplementation(20); 
        
        // Inserting the tree from the image
        t.insert('b');
        t.insert('i');
        t.insert('n');
        t.insert('-');
        t.insert('a');
        t.insert('r');
        t.insert('-');
        t.insert('-');
        t.insert('y');

        System.out.println("--- Tree Operations ---");
        
        // 1. Get the children of 'y'
        t.getChildren('y');
        
        // 2. Get the parent of 'r'
        t.getParent('r');
        
        // 3. Set the right child of 'n' as 'o'
        t.setRightChild('n', 'o');
        
        // 4. Set the parent of 'y' as 'g'
        t.setParent('y', 'g');
        
        // 5. Find the height of the Tree
        System.out.println("Height of the Tree: " + t.getHeight(0));
        
        // 6. Find the size of the entire Tree
        System.out.println("Size of the entire Tree: " + t.getSize(0));
        
        System.out.println("\n--- Final Tree State ---");
        t.display();
    }
}