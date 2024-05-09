/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        if(head==null){
            return null;
        }
        head=reverse(head);
        ListNode node=head;
        ListNode prev=null;
        int carry=0;
        while(node!=null){
            int pro=(node.val*2)+carry;
            if(pro>9){
                carry=1;
                node.val=pro%10;
            }
            else{
                carry=0;
                node.val=pro;
            }
            prev=node;
            node=node.next;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            prev.next=temp;
        }

        return reverse(head);
    }
    public ListNode reverse(ListNode node){
        if(node==null){
            return null;
        }
        ListNode prev=null;
        ListNode temp=node.next;
        while(node!=null){
            node.next=prev;
            prev=node;
            node=temp;
            if(temp!=null){
                temp=temp.next;
            }
        }
        return prev;
    }
}
