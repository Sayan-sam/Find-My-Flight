package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class DijkstrasAlgorithm {

    static HashMap<Integer, String> map = new HashMap<>();

    static int resultDistance;
    static ArrayList<String> resultPath = new ArrayList<String>();
 
    private static final int NO_PARENT = -1;
 
    private static void dijkstra(int[][] adjacencyMatrix, int startVertex, int endVertex)
    {
        int nVertices = adjacencyMatrix[0].length;
 
        int[] shortestDistances = new int[nVertices];
 
        boolean[] added = new boolean[nVertices];
 
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
        {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }
         
        shortestDistances[startVertex] = 0;
 
        // Parent array to store shortest path tree
        int[] parents = new int[nVertices];
 
        // The starting vertex does not have a parent
        parents[startVertex] = NO_PARENT;
 
        // Find shortest path for all vertices
        for (int i = 1; i < nVertices; i++)
        {
 
            // Pick the minimum distance vertex
            // from the set of vertices not yet
            // processed. nearestVertex is
            // always equal to startNode in
            // first iteration.

            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
            {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance)
                {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }
 
            // Mark the picked vertex as
            // processed

            added[nearestVertex] = true;
 
            // Update dist value of the
            // adjacent vertices of the
            // picked vertex.

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
            {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];
                 
                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex]))
                {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }
 
        printSolution(startVertex, endVertex, shortestDistances, parents);
    }
 
    // A utility function to print
    // the constructed distances
    // array and shortest paths
    private static void printSolution(int startVertex, int endVertex, int[] distances, int[] parents)
    {
        int nVertices = distances.length;
        System.out.print("Vertex\t Distance\tPath");
         
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
        {
            if (vertexIndex != startVertex && vertexIndex==endVertex)
            {
                System.out.print("\n" + map.get(startVertex) + " -> ");
                System.out.print(map.get(vertexIndex) + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }
 
    // Function to print shortest path
    // from source to currentVertex
    // using parents array
    private static void printPath(int currentVertex, int[] parents)
    {
         
        // Base case : Source node has
        // been processed
        if (currentVertex == NO_PARENT)
        {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(map.get(currentVertex) + " ");
        result.add(map.get(currentVertex));
    }
 
        // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int begin = -1;
        int over = -1;

        map.put(0, "DEL");
        map.put(1, "BOM");
        map.put(2, "BLR");
        map.put(3, "HYD");
        map.put(4, "CCU");
        map.put(5, "MAA");
        map.put(6, "AMD");
        map.put(7, "GOI");
        map.put(8, "PAT");
        map.put(9, "COK");
        map.put(10, "LKO");
        map.put(11, "GAU");
        map.put(12, "PNQ");
        map.put(13, "JAI");
        map.put(14, "SXR");
        map.put(15, "BBI");
        map.put(16, "IXB");
        map.put(17, "VNS");
        map.put(18, "IXC");
        map.put(19, "IXR");

        int[][] cost = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 0, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 14, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        System.out.println("Enter the Source: ");
        String start = sc.next();
        System.out.println("Enter the Destination: ");
        String end = sc.next();

        for(int i=0; i<20; i++) {
            if(map.get(i).equals(start)) {
                begin = i;
            }
        }

        for(int i=0; i<20; i++) {
            if(map.get(i).equals(end)) {
                over = i;
            }
        }

        if(begin!=-1 && over!=-1) {
            dijkstra(cost, begin, over);
            
            System.out.println("\nThe final sequence: " + result);
        }
        else {
            System.out.println("Invlid Entry");
        }
    }
}
