
/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here	 
	    if(head==null){
	        return head;
	        
	    }
	    if(k==0){
	        return head;
	    }
	    if(k==1){
	        return null;
	    }
	    
	    int n=1;
	    Node prev=null;
	    Node node=head;
	    
	    while(node!=null){
	        if(n==k){
	           // System.out.println(n);
	            prev.next=node.next;
	           // prev=prev.next;
	            node=node.next;
	            
	            
	            
	            n=1;
	            
	        }
	        else if(n<k){
	            n++;
	            prev=node;
	            node=node.next;
	        }
	    }
	    
	    return head;
    }
}
