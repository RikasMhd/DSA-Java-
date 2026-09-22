public class BinaryTreeADT {
    int [] tree;
    int maxSize;
    int currSize;

    BinaryTreeADT(int maxSize){
        this.maxSize = maxSize;
        tree = new int [maxSize];
        this.currSize = 0;
    }
    boolean isEmpty(){
        return currSize == 0;
    }
    boolean isFull(){
        return currSize == maxSize ;
    }
    void insert(int data){
        if(isFull()){
            System.out.println("Tree is Full.");
            return ;
        }
        tree[currSize] = data;
        currSize++;
    }

    int search (int data){
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
    void delete(int data){
        if(search(data) == -1){
            System.out.println("Data Not Found.");
            return ;
        }
        tree[search(data)] = tree[currSize -1];
        tree[currSize -1] = 0;
        currSize --;

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
        BinaryTreeADT t = new BinaryTreeADT(10);
        t.insert(7);
        t.insert(8);
        t.insert(2);
        t.insert(6);
        t.insert(5);
        t.display();

        System.out.println(t.search(6));
        System.out.println(t.search(10));

        System.out.print("Inorder Traversal: ");
        t.inOrderTraversal(0);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        t.preOrderTraversal(0);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        t.postOrderTraversal(0);
        System.out.println();
        
        t.delete(5);
        t.display();
    }
}
