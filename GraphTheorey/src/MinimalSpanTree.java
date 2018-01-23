package GfG;

import java.util.LinkedList;
import java.util.Queue;

public class MinimalSpanTree {

	public static NodeTree createMinimalSpanTree(int [] arr) {

		return createMinimalSpanTreeUtil(arr,0,arr.length-1);
	}


	private static NodeTree createMinimalSpanTreeUtil(int[] arr, int start, int end) {
		if(start>end)
			return null;
		int mid=(start+end)/2;
		NodeTree n= new NodeTree(arr[mid]);
		n.left=createMinimalSpanTreeUtil(arr,start,mid-1);
		n.right=createMinimalSpanTreeUtil(arr,mid+1,end);
		return n;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		NodeTree n=createMinimalSpanTree(arr);
		//PreOrderTraversal(n);
		System.out.println(" LevelOrder");
		LevelOrderTraversal(n);
		System.out.println(" \n PreorderNow");
		PreOrderTraversal(n);
		System.out.println("\n postordernow");
		Postordernow(n);

	}


	private static void Postordernow(NodeTree n) {
		if(n!=null) {
			Postordernow(n.left);
			Postordernow(n.right);
			System.out.print(n.data);
		}

	}


	private static void PreOrderTraversal(NodeTree n) {
		if(n!=null) {
			System.out.print(n.data);
			PreOrderTraversal(n.left);
			PreOrderTraversal(n.right);
		}
	}


	private static void LevelOrderTraversal(NodeTree n) {

		Queue<NodeTree>q= new LinkedList();
		q.add(n);
		while(!q.isEmpty()) {
			NodeTree s=q.poll();
			if(s!=null) {
				System.out.print(s.data);
				if(s.left!=null)
					q.offer(s.left);
				if(s.right!=null)
					q.offer(s.right);
			}
		}

	}

}
