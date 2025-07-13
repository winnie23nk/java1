/*public class Queue {
    static int size;
    static int arr[];
    static int rear=-1;
    Queue(int n){
     size=n;
     arr=new int[n];
    }
    public boolean isEmpty(){
        return rear==-1;
    }

    public void add(int val){
     if(rear==size-1){
        System.out.println("queue full");
        return;
     }
     rear=rear+1;
     arr[rear]=val;
    }

    public void remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println(arr[0]);
    }

    public static void main(String args[]){
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            q.peek();
            q.remove();
        }
    }
}*/

//circular queue using array
/*public class Queue{
    static int size;
    static int arr[];
    static int front=-1;
    static int rear=-1;
    Queue(int n){
    size=n;
    arr=new int[n];
    }
    public  boolean isEmpty(){
        if(front==-1&&rear==-1){
            return true;
        }
        return false;
    }
  
     public  boolean isFull(){
        if((rear+1)%size==front){
            return true;
        }
        return false;
    }
    public  void add(int a){
        if(isFull()){
         System.out.println("queue is full");
         return;
        }
        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=a;

    }

 public  void remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        if(front==rear){
            front=-1;
            rear=-1;
            return;
        }
        front=(front+1)%size;
    }
    public  int peek(){
         if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}*/

//Queue using Linked List
/*public class Queue{
    class node{
        int data;
        node next;
        node(int n){
            data=n;
            next=null;
        }
    }
    public static node head=null;
    public static node tail=null;

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void add(int n){
        node newnode= new node(n);
        if(head==null&&tail==null){
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    
    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        head=head.next;
    }

    public int peek(){
         if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}*/

//Using Java collections

import java.util.LinkedList;
import java.util.Queue;
public class Que{
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
          System.out.println(q.peek());
            q.remove();
        }

    }
}
