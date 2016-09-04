import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node a=new Node(1);
		Node b=new Node(2,a);
		Node c=new Node(3,b);
		Node head=new Node(1,c);
		System.out.println(kToLast(head, 5));



	}
	//find the kth to last element of a singly likned list
	
	public static int kToLast(Node n, int k){
		if(n==null || k<=0) return -1;
		Node p1=n,p2=n;
		for(int i=1;i<k;i++){
			if(p2==null) return -1;
			p2=p2.next;
		}
		if(p2==null) return -1;
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		
		return p1.data;
	}

}
