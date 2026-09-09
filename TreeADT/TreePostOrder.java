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

	public boolean isFull()
	{
		return currSize == maxSize;
	}

	// Inserting elements into the TreeArray
	public void insert(int data)
	{
		if (isFull())
		{
			System.out.println("The Tree is Full already!!");
		}
		else
		{
			treeArray[currSize] = data;
			currSize++;

			System.out.println("Inserted " + data);
		}
	}

	// Post-Order Traversal (Left -> Right -> Root)
	public void postOrderDisplay(int index)
	{
		if (isEmpty())
		{
			System.out.println("The Tree is empty Now.");
			return;
		}

		if (index < 0 || index >= currSize)
		{
			return;
		}

		postOrderDisplay(2 * index + 1); // Visit Left Subtree
		postOrderDisplay(2 * index + 2); // Visit Right Subtree
		System.out.print(treeArray[index] + " "); // Visit Root
	}

	public static void main(String[] args)
	{
		BinaryTreeADT tr = new BinaryTreeADT(7);
		tr.insert(5);
		tr.insert(3);
		tr.insert(9);
		tr.insert(2);
		tr.insert(4);
		tr.insert(7);
		tr.insert(1);

		System.out.print("\nPost-Order Traversal:");
		tr.postOrderDisplay(0);
	}
}
