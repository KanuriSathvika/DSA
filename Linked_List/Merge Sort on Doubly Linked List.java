// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class Solution {
    // Function to sort the given doubly linked list using Merge Sort.
    
    static Node getmid(Node head){
        
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
        // return slow;
    }
    static Node sortDoubly(Node head) {
        // add your code here
        if(head==null ||  head.next==null ){
            return head;
        }
        
        Node  mid = getmid(head);
        Node left=sortDoubly(head);
        Node right=sortDoubly(mid);
        
       return mergesort(left,right);
        
    }
    
    static Node mergesort(Node first,Node second ){
        if(first==null){
            return second;
        }
        if(second==null){
            return first;
        }
       
       
        
        if (first.data < second.data) {
            first.next = mergesort(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        }
        else {
            second.next = mergesort(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
        
        
    }
}
