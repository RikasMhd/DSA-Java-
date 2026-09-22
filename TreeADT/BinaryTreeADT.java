public class BinaryTreeADT
{
	int[] treeArray;
	int maxSize;
	int currSize;
	
	public BinaryTreeADT(int maxSize)
	{
		this.currSize = 0;
		this.treeArray = new int[maxSize];
		this.maxSize = maxSize;
	}
	
	public boolean isEmpty()
	{
		return currSize == 0;
	}
	
	public  boolean isFull()
	{
		return currSize == maxSize;
	}
	
	//Inserting the elements into the TreeArray
	public void insert(int data)
	{
		if(isFull())
		{
			System.out.println("The Tree is Full already!!");
		}
		else
		{
			treeArray[currSize] = data;
			currSize++;
			//treeArray[++currSize] = data;
			System.out.println("Inserted "+ data);
		}
	}
	
	//Level Order Traversal
	public void levelOrderDisplay()
	{
		if(isEmpty())
		{
			System.out.println("The Tree is empty Now.");
		}
		else
		{
			for(int i = 0; i <= currSize; i++)
			{
				if(treeArray[i] != 0)
				{
					System.out.print(treeArray[i] + " ");
				}
			}
		}
	}
	
	//In Order Traversal (Left -> Root -> Right)
	public void inOrderDisplay(int index)
	{
		if(isEmpty())
		{
			System.out.println("The Tree is empty Now.");
		}
		
		if (index <0 || index >= currSize)
		{
			System.out.println("Index is not correct!");
			return;
		}
		else
		{
			inOrderDisplay(2 * index+1); // Visit Left Subtree
			System.out.print(treeArray[index]+ " "); // Visit Root
			inOrderDisplay(2 * index + 2); // Visit Right Subtree
		}
		
	}
	
	public static void main(String [] args)
	{
		BinaryTreeADT tr = new BinaryTreeADT(7);
		tr.insert(5);
		tr.insert(3);
		tr.insert(9);
		tr.insert(2);
		tr.insert(4);
		tr.insert(7);
		tr.insert(1);
		
		tr.inOrderDisplay(0);
	}
}