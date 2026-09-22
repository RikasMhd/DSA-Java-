public class que {
    char [] tree;
    int maxSize;
    int currSize;

    que(int maxSize){
        this.maxSize = maxSize;
        tree = new char [maxSize];
        this.currSize = 0;
    }
    boolean isEmpty(){
        return currSize == 0;
    }
    boolean isFull(){
        return currSize == maxSize ;
    }
    void insert(char data){
        if(isFull()){
            System.out.println("Tree is Full.");
            return ;
        }
        tree[currSize] = data;
        currSize++;
    }

    int findIndex (char data){
        if(isEmpty()){
           System.out.println("Tree is empty.");
        }
        for (int i=0 ; i< currSize ; i++){
            if(tree[i] == data){
                return i ;
            }
        }
        return -1;
        
    }
    void delete(char data){
        if(findIndex(data) == -1){
            System.out.println("Data Not Found.");
            return ;
        }
        tree[findIndex(data)] = tree[currSize -1];
        tree[currSize -1] = 0;
        currSize --;

    }

    void getChildren(char data){
        int index = findIndex(data);
        if( index == -1){
            System.out.println("Data not found");
            return ;
        }
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if ( leftIndex < currSize && tree[leftIndex] != '-'){
            System.out.print(" children of  "+data +" is "+tree[leftIndex]);
        }
        else{
            System.out.println("null");
        }

        if ( rightIndex < currSize && tree[rightIndex] != '-'){
            System.out.println(" children of  "+data +" is "+tree[rightIndex]);
        }
        else{
            System.out.println("null");
        }

    }

    void getParent(char data){
        int index = findIndex(data);

        if( index == -1){
            System.out.println("Data is not found.");
            return ;
        }

        int parentIndex = ( index-1 ) / 2;
        System.out.println("Parent of " + data + " is " + tree[parentIndex]); 
    }

    void setRightChild(char parentData, char newData){
        int rightIndex = findIndex(parentData);

        if (rightIndex == -1) {
            System.out.println("Parent node " + parentData + " not found.");
            return;
        }

        int rightData = rightIndex * 2 + 2;
        if(rightIndex <maxSize){
            if(rightIndex >= currSize){
                tree[rightData] = newData;
                System.out.println("Set right child of '" + parentData + "' to '" + newData + "'.");
            }
        }
        else{
            System.out.println("null");
        }

    }

    void setParent(char oldParent, char newParent){
        int parentIndex = findIndex(oldParent);

        if (parentIndex == -1) {
            System.out.println("Parent node " + oldParent + " not found.");
            return;
        }

        int parent = (parentIndex -1) / 2;
        tree[parent]=newParent;
        System.out.println("Set the parent of '" + oldParent + "' to '" + newParent + "'.");
    }

    int getHeight(int index){
        if (index >= currSize || tree[index] == '-') {
            return 0; // Base case: empty node has height 0
        }
        
        int leftHeight = getHeight(2 * index + 1);
        int rightHeight = getHeight(2 * index + 2);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }


    void inOrderTraversal(int index){
        if(isEmpty()){
            System.out.println("Tree is Empty.");
            return ;
        }
        if (index < 0 || index >= currSize ){
            return ;
        }
        inOrderTraversal(index * 2 + 1);
        System.out.print(tree[index] + " ");
        inOrderTraversal(index * 2 + 2);
        
    }
    void preOrderTraversal(int index){
        if(isEmpty()){
            System.out.println("Tree is Empty.");
            return ;
        }
        if (index < 0 || index >= currSize ){
            return ;
        }
        System.out.print(tree[index] + " ");
        inOrderTraversal(index * 2 + 1);
        inOrderTraversal(index * 2 + 2);
        
    }
    void postOrderTraversal(int index){
        if(isEmpty()){
            System.out.println("Tree is Empty.");
            return ;
        }
        if (index < 0 || index >= currSize ){
            return ;
        }
        inOrderTraversal(index * 2 + 1);
        inOrderTraversal(index * 2 + 2);
        System.out.print(tree[index] + " ");
        
    }
    void display(){
        for (int i = 0 ; i < currSize ;i ++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        que t = new que(10);
        t.insert('b');
        t.insert('i');
        t.insert('n');
        t.insert('-');
        t.insert('a');
        t.insert('r');
        t.insert('-');
        t.insert('-');
        t.insert('-');
        t.insert('-');
        t.insert('y');
        t.display();

        System.out.println("find  b ? : "+t.findIndex('b'));
        System.out.println("find z ? : "+t.findIndex('z'));

        System.out.print("Inorder Traversal: ");
        t.inOrderTraversal(0);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        t.preOrderTraversal(0);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        t.postOrderTraversal(0);
        System.out.println();
        
        System.out.print("Get the children of 'y' : ");
        t.getChildren('y');

        System.out.print("Get the parent of 'r' : ");
        t.getParent('r');

        System.out.print("set the right child of 'n' as 'o' : ");
        t.setRightChild('n','o');

        System.out.print("Set the Parent of 'y' as 'g' : ");
        t.setParent('y','g');

        System.out.print("height of the Tree : ");
        t.getHeight(0);


        t.display();
    }
}
