package de.unituebingen.sfs.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

/**
 * Hello Graph World!
 *
 */
public class Graph 
{

    public Graph(int V) {
	// your code here
    }

    public static Graph readGraph(BufferedReader reader) throws IOException {

	// dummy creation of a graph, just to get it compiled
        Graph graph = new Graph(0);	
	return graph;
    }

    public void addEdge(int v, int w) {
    }

    public Iterable<Integer> adj(int v) {

	// just get it compiled..., use appropriate data structure
	return new ArrayList<Integer>();
    }

    public int degree(int v) {
	return 0;
    }

    public int V() {
	return 0;
    }

    public int E() {
	return 0;	
    }    
    
    public static void main( String[] args )
    {
        System.out.println( "Hello Graph World!" );
    }
}
