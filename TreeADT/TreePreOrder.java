public class TreePreOrder
{
	int[] treeArray;
	int maxSize;
	int currSize;

	public TreePreOrder(int maxSize)
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

	// Pre-Order Traversal (Root -> Left -> Right)
	public void preOrderDisplay(int index)
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
		
		System.out.print(treeArray[index] + " "); // Visit Root
		preOrderDisplay(2 * index + 1); // Visit Left Subtree
		preOrderDisplay(2 * index + 2); // Visit Right Subtree
	}

	public static void main(String[] args)
	{
		TreePreOrder tr = new TreePreOrder(7);
		tr.insert(5);
		tr.insert(3);
		tr.insert(9);
		tr.insert(2);
		tr.insert(4);
		tr.insert(7);
		tr.insert(1);

		System.out.print("\nPre-Order Traversal: ");
		tr.preOrderDisplay(0);
	}
}
