 
public class DFS_BFS {

	public static void main(String[] args) {
		 
int [][]conn= {
			   {0,1,0,1,0,0,0,0,1},
			   {1,0,0,0,0,0,0,1,0},
			   {0,0,0,1,0,1,0,1,0},
			   {1,0,1,0,1,0,0,0,0},
			   {0,0,0,1,0,0,0,0,1},
			   {0,0,1,0,0,0,1,0,0},
			   {0,0,0,0,0,1,0,0,0},
			   {0,1,1,0,0,0,0,0,0},
			   {1,0,0,0,1,0,0,0,0}
			 };
	Graph g= new Graph(conn);
	g.BFS();
}

}
