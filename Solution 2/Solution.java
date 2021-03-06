import java.util.Scanner;

class Solution{
	
	LinkedListNode head;
	
	Solution(){
		
		this.head=null;
	}
	
	 class LinkedListNode{
		
		int data;
		LinkedListNode next;
		
		LinkedListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	 void createList(){
		
		int i,size,data;
		
		Scanner scan = new Scanner(System.in);
		
		size=scan.nextInt();
		
		if(size==0)
		return;
	
		for(i=1;i<=size;i++){
		
		LinkedListNode p; 
			
		data=scan.nextInt();
		
		LinkedListNode temp = new LinkedListNode(data);
		
		if(head==null){
			head = temp;
		}
		else{
		
		p=head;
		
		while(p.next!=null){
			p=p.next;
		}
		p.next = temp;
		}
	}
	}
	 LinkedListNode reverse(){
		
		LinkedListNode prev,p,link;
		
		prev = null;
		p=head;
		 while(p!=null){
			 link=p.next; 
			p.next=prev;
			 prev=p;
			 p=link;
		 }	
		 head = prev;
		 return head;
		
	}
	
	void display(){
		LinkedListNode p = head;
		if(head==null){
			System.out.println("List is empty ");
			return;
		}
		while(p!=null){
			System.out.print(p.data + " ");
			p=p.next;
		}
			
	}
	
	public static void main(String... args){
		
		Solution list = new Solution();
	Scanner scan = new Scanner(System.in);
	for(int i=1;i<=2;i++){
		int n = scan.nextInt();
		list.createList();
		list.reverse();	
		System.out.println();		
		list.display();
		System.out.println();	
		}
		
	}
}