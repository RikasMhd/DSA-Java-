public class GraphADT {

    int[][] adjacencyMatrix;
    int numOfVertices;
    int maxVertices;

    GraphADT(int maxVertices) {
        this.maxVertices = maxVertices;
        this.numOfVertices = 0;
        adjacencyMatrix = new int[maxVertices][maxVertices];
    }

    public boolean isEmpty() {
        return numOfVertices == 0;
    }

    public boolean isFull() {
        return numOfVertices == maxVertices;
    }

    public void insertVertex() {
        if (isFull()) {
            System.out.println("Graph ADT is Full");
            return;
        }
        numOfVertices++;
    }

    public void insertEdge(int source, int destination, int weight) {
        if (source >= 0 && source < numOfVertices &&
            destination >= 0 && destination < numOfVertices) {

            adjacencyMatrix[source][destination] = weight;
            // Uncomment this line for an undirected graph
            // adjacencyMatrix[destination][source] = weight;
        } 
		else {
            System.out.println("Invalid vertices");
        }
    }

    public void deleteEdge(int source, int destination) {
        if (source >= 0 && source < numOfVertices &&
            destination >= 0 && destination < numOfVertices) {

            adjacencyMatrix[source][destination] = 0;
            // Uncomment for an undirected graph
            // adjacencyMatrix[destination][source] = 0;

        } 
		else {
            System.out.println("Invalid vertices");
        }
    }
		
	public boolean isEdge(int source, int destination){
		return adjacencyMatrix[source][destination] != 0; 
	}
	
    public void deleteVertex(int vertex) {
        if (vertex < 0 && vertex < numOfVertices) {
            System.out.println("Invalid vertex");
            
			for (int i = vertex; i < numOfVertices - 1; i++) {
				for (int j = 0; j < numOfVertices; j++) {
					adjacencyMatrix[i][j] = adjacencyMatrix[i + 1][j];
				}
			}
		}
	}
	
    public void traverseGraph() {
        if (isEmpty()) {
            System.out.println("Graph is empty");
            return;
        }

        for (int i = 0; i < numOfVertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < numOfVertices; j++) {

                if (adjacencyMatrix[i][j] != 0) {
                    System.out.print(j + "(weight=" + adjacencyMatrix[i][j] + ") ");
                }
            }
            System.out.println();
        }
    }

    public void displayMatrix() {

        System.out.println("\nAdjacency Matrix:");

        for (int i = 0; i < numOfVertices; i++) {

            for (int j = 0; j < numOfVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        GraphADT graph = new GraphADT(10);

        for (int i = 0; i < 10; i++) {
            graph.insertVertex();
        }

        graph.insertEdge(0, 1, 10);
        graph.insertEdge(0, 2, 20);
        graph.insertEdge(1, 3, 30);
        graph.insertEdge(2, 9, 24);
        graph.insertEdge(4, 7, 15);
        graph.insertEdge(3, 2, 33);

        System.out.println("\nGraph:");
        graph.traverseGraph();

        graph.displayMatrix();

        System.out.println("\nDeleting edge 0 -> 1...");
        graph.deleteEdge(0, 1);

        graph.traverseGraph();

        System.out.println("\nDeleting vertex 4...");
        graph.deleteVertex(4);

        graph.traverseGraph();

        graph.displayMatrix();
    }
}
