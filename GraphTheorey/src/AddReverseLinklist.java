
public class AddReverseLinklist {

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
		
		a.data=7;
		b.data=4;
		c.data=9;
		d.data=0;
		e.data=2;
		
		
		Node a1= new Node();
		Node b1= new Node();
		Node c1= new Node();
		Node d1= new Node();
		Node e1= new Node();
		
		a1.next=b1;
		b1.next=c1;
		c1.next=d1;
		d1.next=e1;

		a1.data=4;
		b1.data=9;
		c1.data=8;
		d1.data=6;
		e1.data=9;
		
		int carry=0;
		Node result=addInreverse(a,a1,carry);
		
		while(result!=null) {
			
			System.out.print(result.data);
			result=result.next;
		}

	}

	private static Node addInreverse(Node a, Node a1, int carry) {
		
		if(a==null && a1==null && carry==0)
			return null;
		Node r= new Node();
		
		int result=carry;
		if(a!=null)result+=a.data;
		if(a1!=null)result+=a1.data;
		
		r.setData(result%10);
		carry=result/10;
		
		r.setNext(addInreverse(a!=null?a.next:null, a1!=null?a1.next:null, carry));
		
		return r;
	}


}
