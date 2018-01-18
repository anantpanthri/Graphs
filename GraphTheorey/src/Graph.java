import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	int [][] adjmatrix;
	int rootNode=0;
	int NNode;
	boolean[] visited;
	Graph(int[][]mat){
		NNode=mat.length;
		adjmatrix=new int[NNode][NNode];
		visited=new boolean[NNode];
		adjmatrix=mat.clone();
	}
	
	public void BFS() {
		Queue<Integer> q= new LinkedList<Integer>();
		q.add(0);
		while(!q.isEmpty()) {
			int nextNode;
			nextNode=q.remove();
			if(!visited[nextNode])
			{
				visited[nextNode]=true;
				System.out.println("NextNode"+nextNode);
				for(int i=0;i<NNode;++i) {
					if(adjmatrix[nextNode][nextNode]!=0 &&!visited[i])
						q.add(i); 
				}
			}
					
			
			
			
			
		}
	}
	
}
