package GfG;
import java.util.*;

/*
 * to check if a route exists between two nodes.
 */

public class CheckRouteBetweenNode {
	private static int V;
	private static LinkedList <Integer>adjList[];
	
	public CheckRouteBetweenNode(int V) {
		this.V=V;
		adjList= new LinkedList[V];
		for(int i=0;i<V;++i) {
			adjList[i]= new LinkedList<>();
		}
	}
	
	public void addEdge( int src, int des) {
		adjList[src].add(des);
		
	}
	
	public static boolean bfs(int start, int end) {
		Queue<Integer>q= new LinkedList();
		boolean visited[]=new boolean[V];
		// will be working via node 0;
		int index=0;
		q.add(index);
		visited[index]=true;
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(index);
		while(!q.isEmpty()) {
			int s= q.poll();
			if(!(s==index))
			System.out.println("polling from vertex "+index+": " + s);
			if(index==V)
				return false;
			Iterator<Integer> it=adjList[index].listIterator();
			
			while(it.hasNext()) {
				int i= it.next();
				arr.add(i);
				if(!visited[i]) {
					visited[i]=true;
					q.add(i);
				}
			}
			if(arr.contains(start)&&arr.contains(end))
				return true;
			if(q.isEmpty()) {
				arr.clear();
				boolean visitednew[]=new boolean[V];
				visited=visitednew.clone();
				q.add(++index);
			}
			
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		CheckRouteBetweenNode g= new CheckRouteBetweenNode(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 0);
		g.addEdge(1, 4);
		g.addEdge(1, 3);
		g.addEdge(2, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		g.addEdge(3, 4);
		g.addEdge(4, 3);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		
		System.out.println(bfs(3,9));

	}

}
