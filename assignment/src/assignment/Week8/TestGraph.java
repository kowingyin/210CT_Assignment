/**
 * 
 */
package assignment.Week8;

/**
 * @author ko
 *
 */
public class TestGraph {
	/**
	 * @param args
	 */
	 public static void main(String args[]) { 
	     
	     int V = 9; //No. of Vertice
	     GraphStruc g = new GraphStruc(V); 
	     g.addEdge(1, 0); 
	     g.addEdge(0, 2); 
	     g.addEdge(2, 1); 
	     g.addEdge(0, 3); 
	     g.addEdge(1, 4); 
	     g.printGraph(); 
	     g.BFS(2);
	     g.BFS(0);
	     g.DFS(2);
	     g.DFS(0);
	 }
	 


}
