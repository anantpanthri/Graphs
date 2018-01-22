package GfG;

class TellsLevelOftreeNodes
{
	Node root;
	int getLevelUtil(Node node, char data, int level) 
	{
		if (node == null)
			return 0;

		if (node.data == data)
			return level;

		int downlevel = getLevelUtil(node.prev, data, level + 1);
		if (downlevel != 0)
			return downlevel;

		downlevel = getLevelUtil(node.next, data, level + 1);
		return downlevel;
	}

	/* Returns level of given data value */
	int getLevel(Node node, char data) 
	{
		return getLevelUtil(node, data, 1);
	}

	/* Driver function to test above functions */
	public static void main(String[] args) 
	{
		TellsLevelOftreeNodes tree = new TellsLevelOftreeNodes();

		/* Constructing tree given in the above figure */
		Node a= new Node('a');
		Node b= new Node('b');
		Node c= new Node('c');
		Node d= new Node('d');
		Node e= new Node('e');
		Node f= new Node('f');
		Node g= new Node('g');
		Node h= new Node('h');
		Node i= new Node('i');
		
		a.prev=b;
		b.next=c;
		b.prev=d;
		a.next=e;
		e.prev=f;
		e.next=g;
		g.next=i;
		i.next=h;
		for (int x = 97; x <= 105; x++) 
		{
			int level = tree.getLevel(a, (char)x);
			if (level != 0)
				System.out.println("Level of " + (char)x + " is "
						+ tree.getLevel(a, (char)x));
			else
				System.out.println((char)x + " is not present in tree");
		}
	}
}

 
