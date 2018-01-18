import java.util.Stack;
//checking linklist is pallindrome or not
public class EvenOddPallindrome {

	public static void main(String[] args) {
		Node a= new Node();
		Node b= new Node();
		Node c= new Node();
		Node d= new Node();
		 Node e= new Node();
		
		a.next=b;
		b.next=c;
		c.next=d;
	 	d.next=e;
		
		a.data=9;
		b.data=9;
		c.data=2;
		d.data=9;
 		e.data=9;
	//pallindrome,loop,floyd algorithm
		Node head=a;
		int g=0;
		while(head!=null) {
			++g;
			head=head.next;
		}
		//even palindrome
		head=a;
		if(g%2==0)
		{
			Stack<Integer>st= new Stack<>();
			int count=0;
			while(head!=null) {
				if(count<g/2)
				{
					st.push(head.data);
					++count;
				}
				else {
					if(st.pop()!=head.data)
						break;
					else {
						++count;
					}
				}
				
				head=head.next;
			}
			
			if(count!=g)
				System.out.println("not pallindrome");
			else
				System.out.println("palilndrome");
			
			
		}
		//odd pallindrome
		else {
			
			Stack<Integer>st= new Stack<>();
			int count=0;
			while(head!=null) {
				if(count<g/2)
				{
					st.push(head.data);
					++count;
				}
				else if(count==(g/2))
					++count;
				else {
					if(st.pop()!=head.data)
						break;
					else {
						++count;
					}
				}
				
				head=head.next;
			}
			
			if(count!=g)
				System.out.println("not pallindrome");
			else
				System.out.println("palilndrome");
			
			
			
			
		}
		

	}

}
