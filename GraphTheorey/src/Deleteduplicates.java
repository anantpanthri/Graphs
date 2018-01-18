//Delete duplicates without a temporary buffer
import java.util.Hashtable;
public class Deleteduplicates {

	public static void main(String[] args) {
		Node a= new Node();
		Node b= new Node();
		Node c= new Node();
		Node d= new Node();
		Node e= new Node();
		Node f= new Node();
		a.data=2;
		b.data=3;
		c.data=4;
		d.data=5;
		e.data=6;
		f.data=4;
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		
		deleteDuplicates(a);
	}

	public static void deleteDuplicates(Node a) {
		
		Node head=a;
		Node prev=a;
		a=prev;
		Hashtable<Integer, Boolean> ht= new Hashtable<>();
		while(head!=null){
			if(ht.containsKey(head.data)) {
				prev.next=head.next;
				head=head.next;
			}
				else {
					prev=head;
					ht.put(head.data, true);
					head=head.next;
				}
		}
		
		
		while(a!=null) {
			
			System.out.print(a.data+",");
			a=a.next;
		}
	}
}
