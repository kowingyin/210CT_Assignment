package assignment.Week8;
import java.util.Iterator;
//Java Program to demonstrate adjacency list  
//representation of graphs 
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; 

public class GraphStruc {  
     int V; 
     private LinkedList<Integer> adjListArray[]; 
       
     // constructor  
     GraphStruc(int V) { 
         this.V = V; // number of vertices 
         
         adjListArray = new LinkedList[V]; 
           
         // Create a new list for each vertex for adjacent nodes
         for(int i = 0; i < V ; i++) { 
             adjListArray[i] = new LinkedList<>(); 
         } 
     }

     public void addEdge( int src, int dest) { // Add an edge connecting src to dest. 
	      
	     adjListArray[src].add(dest); 
	     adjListArray[dest].add(src); // the graph is undirected, add an edge from dest to src also 
     } 

	
	 public void printGraph() {   // function for printing the adjacency list representation of graph       
	     for(int i = 0; i < V; i++) { 
	         System.out.println("Adjacency list of vertex "+ i); 
	         System.out.print("head"); 
	         for(Integer av: adjListArray[i]) { 
	             System.out.print(" -> "+av); 
	         } 
	         System.out.println("\n"); 
	     } 
	 }
	 
	 public void DFS(int i){// i = starting vertice
		 boolean visited[] = new boolean[V]; // Mark all the vertices as not visited (set as false by default in java)

         // Create a stack for DFS 
         Stack<Integer> stack = new Stack<>(); 
           
         // Push the current source node 
         stack.push(i); 
           
         while(stack.empty() == false) { 
             // Pop a vertex from stack and print it 
             i = stack.peek(); 
             stack.pop(); 
               
             // Stack may contain same vertex twice. So 
             // we need to print the popped item only 
             // if it is not visited. 
             if(visited[i] == false) { 
                 System.out.print(i + " "); 
                 visited[i] = true; 
             } 
               
             // Get all adjacent vertices of the popped vertex s 
             // If a adjacent has not been visited, then push it 
             // to the stack. 
             Iterator<Integer> itr = adjListArray[i].iterator(); 
               
             while (itr.hasNext()) { 
                 int v = itr.next(); 
                 if(!visited[v]) {
                     stack.push(v);
                 }
             } 
               
         } 
         System.out.println("");
	 }
	 
	 public void BFS(int i){// i = starting vertice
		 boolean visited[] = new boolean[V]; // Mark all the vertices as not visited (set as false by default in java)

         // Create a stack for BFS
         Queue<Integer> queue = new LinkedList<Integer>();

         visited[i]=true; 
         queue.add(i); 
           
         while (queue.size() != 0) { 
             
             i = queue.poll();  
             
             System.out.print(i+" ");  

             Iterator<Integer> itr = adjListArray[i].iterator(); 
               
             while (itr.hasNext())  { 
                 int v = itr.next(); 
                 if(!visited[v]) { 
                     visited[v] = true; 
                     queue.add(v); 
                 } 
             } 
               
         } 
         System.out.println("");
	 }
} 