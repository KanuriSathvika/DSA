import java.util.* ;
import java.io.*; 
public class Deque 
{
    // Initialize your data structure.
    ArrayList<Integer> list;
    int len;
    public Deque(int n) 
    {
        // Write your code here.

        // int[] deque=new int[n];
       list=new ArrayList<>();

         len=n;
       

    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        // ArrayList<Integer> list=new ArrayList<>();
        // Write your code here.
        if(list.size()<len){
            list.add(0,x);
            return true;
        }
        return false;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        // Write your code here.
        if(list.size()<len){
            list.add(x);
            return true;
        }
        return false;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        // Write your code here.
        if(list.size()>0){
            int pop=list.remove(0);
            return pop;
        }
        return -1;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        // Write your code here.
        if(list.size()>0){
            int pop=list.remove(list.size()-1);
            return pop;
        }
        return -1;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        // Write your code here.
        if(list.size()>0){
            return list.get(0);
        }
        return -1;
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        // Write your code here.
        if(list.size()>0){
            return list.get(list.size()-1);

        }
        return -1;
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        // Write your code here.
        if(list.isEmpty()){
            return true;
        }
        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        // Write your code here.
        if(list.size()==len){
            return true;
        }
        return false;
    }
}
