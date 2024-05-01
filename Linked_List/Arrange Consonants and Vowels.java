/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        if(head==null)
        {
            return null;
        }
        
        Node con=null;
        Node contail=con;
        Node vow=new Node('A');
        Node vowtail=vow;
        
        // String s="aeiou";
        
        while(head!=null){
            Node temp=new Node(head.data);
            char ch=head.data;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                
                vowtail.next=temp;
                vowtail=vowtail.next;
            }
            else{
                if(con==null){
                    con=temp;
                    contail=temp;
                }
                else{
                    contail.next=temp;
                    contail=contail.next;
                }
            }
            head=head.next;
        }
        
        vowtail.next=con;
        
        return vow.next;
    }
}
