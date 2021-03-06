import java.util.Stack;

public class DFS {
	private final int maxVertices=20;
	private Vertex vertexList[];
	private int vertexCount;
	private int adjMatrix[][];
	private Stack<Integer> theStack;
	
	public DFS() {
		vertexList= new Vertex[maxVertices];
		adjMatrix=new int[maxVertices][maxVertices];
		vertexCount=0;
		for(int y=0;y<maxVertices;y++)
			for(int x=0;x<maxVertices;++x)
				adjMatrix[x][y]=0;
		theStack=new Stack<Integer>();
	}
	public void addVertex(char lab) {
		vertexList[vertexCount++]=new Vertex(lab);
	}
	public void addEdge(int i,int j) {
		adjMatrix[i][j]=1;
		adjMatrix[j][i]=1;
		
	}
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	
	public void dfs() {
		vertexList[0].visited=true;
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()) {
			int v= getAdjUnvisitedVertex(theStack.peek());
			if(v==-1)
				theStack.pop();
			else {
				vertexList[v].visited=true;
				displayVertex(v);
				theStack.push(v);
			}
		}
		
		for(int j=0;j<vertexCount;j++)
			vertexList[j].visited=false;
	}
	
	public int getAdjUnvisitedVertex(int v) {
		for(int j=0;j<vertexCount;++j) 
			if(adjMatrix[v][j]==1 && vertexList[j].visited==false)
				return j;
		return -1;
	}
	
	
}
