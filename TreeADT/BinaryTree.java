public class BinaryTree{
	int []treeArray;
	int maxSize;
	int currentSize;
	
	public BinaryTree(int maxSize){
		this.currentSize=0;
		this.maxSize=maxSize;
		treeArray=new int[maxSize];
	}
	
	boolean isEmpty(){
		return currentSize==0;
	}
	boolean isFull(){
		return currentSize==maxSize;
	}
	
	void insert(int data){
		if(isFull()){
			System.out.println("Tree Array is Full.You cannot insert "+data);
			return ;
		}
		treeArray[currentSize]=data;
		currentSize++;
	}
	 void delete(int data){
		if(isEmpty()){
			System.out.println("Tree Array is Empty");
			return ;
		} 
		  
	 }
	void show(){
		if(isEmpty()){
			System.out.println("Tree Array is Empty");
			return ;
		}
		for(int i=0;i<currentSize;i++){
			System.out.print(treeArray[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		BinaryTree bt=new BinaryTree(10);
		bt.insert(5);
		bt.insert(3);
		bt.insert(9);
		bt.insert(2);
		bt.insert(4);
		bt.insert(7);
		bt.insert(1);
		
		bt.show();
	}
}