//Stack using Linked list
/*public class Stack {
    class Node{
        int val;
        Node next;
        Node(int val){
         this.val=val;
         this.next=null;
        }
    }
    static Node head;
    public boolean isEmpty(){
    if(head==null){
        return true;
    }
    return false;
    }
    public void push(int val){
        Node newnode= new Node(val);
        if(isEmpty()){
         head=newnode;
         return;
        }
      newnode.next=head;
       head=newnode;

    }
    public void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        head=head.next;
    }
    public int peek(){
        if(isEmpty()){
            return-1;
        }
        int data=head.val;
        return data;

    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
       System.out.println( s.peek()); 
        s.pop();
        }
        
    }
    
}*/

// ArrayList Implementation

/*import java.util.*;
public class Stack{
    ArrayList<Integer>list=new ArrayList<>();
    public boolean isEmpty(){
        return list.size()==0;
    }
    public void push(int val){
        list.add(val);
    }
    public void pop(){
        list.remove(list.size()-1);
    }
    public int peek(){
        return list.get(list.size()-1);
    }
    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
       System.out.println( s.peek()); 
        s.pop();
        }
    }
}*/

// Using Java Collection
/*import java.util.*;
public class Stack{
    public static void main(String[] args) {
        java.util.Stack<Integer>s=new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
       System.out.println( s.peek()); 
        s.pop();
        }
        
    }
}*/

//Pushing an element at the bottom of the stack(own method)
/*import java.util.*;
public class Stack{
   
        public static void pushAtlast(int val,java.util.Stack<Integer>s){
            ArrayList<Integer>arr=new ArrayList<>();
            while(s.size()!=0){
                arr.add(s.peek());
                s.pop(); 
            }
            s.push(val);
            int count=arr.size();
            int i=1;
            while(count>0){
                s.push(arr.get(arr.size()-(i++)));
                count--;
            }
        }
    public static void main(String[] args) {
     java.util.Stack<Integer>s=new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtlast(5,s);
       
        while(!s.isEmpty()){
       System.out.println( s.peek()); 
        s.pop();
        }
        
    }
}*/

//using recursion

/*public class Stack{
   
        public static void pushAtlast(int val,java.util.Stack<Integer>s){
            if(s.isEmpty()){
                s.push(val);
                return;
            }
            int top=s.pop();
            pushAtlast(val, s);
            s.push(top);
        }
    public static void main(String[] args) {
     java.util.Stack<Integer>s=new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtlast(5,s);
       
        while(!s.isEmpty()){
       System.out.println( s.peek()); 
        s.pop();
        }
        
    }
}*/

//Reversing a stack(recursion)
/*import java.util.*;
public class Stack{
   
        public static void pushAtlast(int val,java.util.Stack<Integer>s){
           if(s.isEmpty()){
                s.push(val);
                return;
            }
            int top=s.pop();
            pushAtlast(val, s);
            s.push(top);
        }
        public static void reverse(java.util.Stack<Integer>s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            reverse(s);
            pushAtlast(top,s);

        }
    public static void main(String[] args) {
     java.util.Stack<Integer>s=new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);
       
        while(!s.isEmpty()){
       System.out.println( s.peek()); 
        s.pop();
        }
        
    }
}*/

//using own method
public class Stack{
   
        public static void reverse(java.util.Stack<Integer>s){
            java.util.Stack<Integer> s1=new java.util.Stack<>();
            while(!s.isEmpty()){
                s1.push(s.pop());
            }
            while(!s1.isEmpty()){
       System.out.println( s1.peek()); 
        s1.pop();
        }
        }
    public static void main(String[] args) {
     java.util.Stack<Integer>s=new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);
       
        
    }
}



