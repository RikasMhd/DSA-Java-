class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ALGraphADT {

    int numVertices, maxVertices;
    Node[] adjacencyList;

    public ALGraphADT(int maxVertices) {
        this.maxVertices = maxVertices;
        this.numVertices = 0;
        this.adjacencyList = new Node[maxVertices];
    }

    public boolean isEmpty() {
        return numVertices == 0;
    }

    public boolean isFull() {
        return numVertices == maxVertices;
    }

    public void insertVertex() {
        if (isFull()) {
            System.out.println("Graph ADT is Full");
            return;
        }

        numVertices++;
    }

    public void insertEdge(int source, int destination) {

        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {

            Node newNode = new Node(destination);

            newNode.next = adjacencyList[source];
            adjacencyList[source] = newNode;

        }  
		else {
            System.out.println("Invalid Vertex");
        }
    }

    public boolean search(int source, int destination) {

        if (source < 0 || source >= numVertices ||
            destination < 0 || destination >= numVertices) {

            System.out.println("Invalid Vertex");
            return false;
        }

        Node current = adjacencyList[source];

        while (current != null) {

            if (current.data == destination) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    public void traverseGraph() {

        for (int i = 0; i < numVertices; i++) {

            Node current = adjacencyList[i];

            System.out.print("Vertex " + i + " is connected to: ");

            while (current != null) {

                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        ALGraphADT graph = new ALGraphADT(10);

        // Insert 10 vertices
        for (int i = 0; i < 10; i++) {
            graph.insertVertex();
        }

        // Insert edges
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 9);
        graph.insertEdge(4, 7);
        graph.insertEdge(3, 2);

        // Traverse graph
        System.out.println("Graph:");
        graph.traverseGraph();

        // Search examples
        System.out.println("\nSearching for edge 0 -> 1:");

        if (graph.search(0, 1)) {
            System.out.println("Edge exists");
        } else {
            System.out.println("Edge does not exist");
        }

        System.out.println("\nSearching for edge 0 -> 5:");

        if (graph.search(0, 5)) {
            System.out.println("Edge exists");
        } else {
            System.out.println("Edge does not exist");
        }
    }
}
