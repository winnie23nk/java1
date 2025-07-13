//Basic Implementation of Linked List
   class LL{
        public int size;
        class Node{
            String data;
            Node next;

             Node(String data){
                this.data=data;
                this.next=null;
                size++;
            }
        }
        Node head;

        public void addFirst(String data){
            Node newnode=new Node(data);
        if(head==null){
         head=newnode;
         return;
        }
        newnode.next=head;
        head=newnode;
        }

        public void addLast(String data){
        Node newnode= new Node(data);
        if(head==null){
         head=newnode;
         return;
        }
        Node currnode;
        currnode=head;
        while(currnode.next!=null){
        currnode=currnode.next;
        }
        currnode.next=newnode;
        }

        public void deleteFirst(){
            if(head==null){
            System.out.println("No elements to delete");
            return;
            }
            size--;
            System.out.println("Element deleted is: "+head.data);
            head=head.next;
        }
        public void deleteLast(){
            if(head==null){
            System.out.println("No elements to delete");
            return;
            }
            size--;
            if(head.next==null){
                System.out.println("Element deleted is: "+head.data);
                head=null;
                return;
            }
            Node seclastnode=head;
            Node lastnode=head.next;
            while(lastnode.next!=null){
                lastnode=lastnode.next;
                seclastnode=seclastnode.next;
            }
            
            System.out.println("Element deleted is: "+lastnode.data);
            seclastnode.next=null;
            
        }
        public void print(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            Node currnode;
            currnode=head;
            while(currnode!=null){
            System.out.println(currnode.data);
            currnode=currnode.next;
        }
        System.out.println("null");
        }
        public int size(){
            return size;
        }
        public static void main(String args[]){
        LL list=new LL();
        list.addFirst("a");
        list.addLast("b");
        list.addFirst("c");
        list.addLast("d");
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        System.out.println(list.size());
         list.addFirst("c");
         System.out.println(list.size());
        }
    }

    //Linked list using java collection
  
    /*import java.util.*;

    class LL{
        public static String value="a";
        public static void main(String[] args) {
            LinkedList<String>list=new LinkedList<>();
            list.addFirst("is");
            list.addFirst("this");
            list.addLast("a");
            System.out.println(list);
            list.removeFirst();
            System.out.println(list);
            list.removeLast();
            System.out.println(list);
            list.add("a"); //adds at the end of linked list 
            System.out.println(list);
            System.out.println(list.size());

            for(int i=0;i<list.size();i++){
                if(value==list.get(i)){
                System.out.println(i);
                }
            }

              for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            list.add(0,"this");
            System.out.println(list);
            list.remove(0);
            System.out.println(list);
        }
    }*/

    //Reversing Linked List using iteration
    /*class LL{
        public Node head;
        class Node{
            int data;
            Node next;
            
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void addFirst(int data){
            Node newnode= new Node(data);
            if(head==null){
            head=newnode;
            return;
            }
            newnode.next=head;
            head=newnode;
        }

        public void print(){
            Node currnode;
            currnode=head;
            while(currnode!=null){
                System.out.print(currnode.data+"->");
                currnode=currnode.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public void reverse(){
            if(head==null||head.next==null){
                return;
            }
            Node prev=head;
            Node curr=head.next;
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head.next=null;
            head=prev;
        }

        public static void main(String[] args) {
            LL list=new LL();
            list.addFirst(4);
            list.addFirst(3);
            list.addFirst(2);
            list.addFirst(1);
            list.print();
            list.reverse();
             list.print();
        }
    }*/

    //Reversing Linked list using recursion
    

    /*class LL{
        public Node head;
        class Node{
            int data;
            Node next;
            
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void addFirst(int data){
            Node newnode= new Node(data);
            if(head==null){
            head=newnode;
            return;
            }
            newnode.next=head;
            head=newnode;
        }

        public void print(){
            Node currnode;
            currnode=head;
            while(currnode!=null){
                System.out.print(currnode.data+"->");
                currnode=currnode.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public Node reverse(Node head){
            if(head==null||head.next==null){
                return head;
            }
            Node newhead=reverse(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;

           

        }

        public static void main(String[] args) {
            LL list=new LL();
            list.addFirst(4);
            list.addFirst(3);
            list.addFirst(2);
            list.addFirst(1);
            list.head=list.reverse(list.head);
            list.print();
            
             
        }
    }*/

    /*import java.util.*;
    class LL{
        public static boolean val=true;
        public static void main(String[] args) {
            LinkedList<Integer>list=new LinkedList<>();
             Scanner sc = new Scanner(System.in);

                while(val){
                     System.out.println("Enter true to enter and false to exit");
                     val=sc.nextBoolean();
                     if(val==true){
                        System.out.println("Enter the data");
                        list.add(sc.nextInt());
                     }
                }

                System.out.println(list);
               int i=0;
               while(i<list.size()){
                if(list.get(i)>25){
                    list.remove(i);
                }
                else{
                    i++;
                }
               }
                
                System.out.println(list);
                sc.close();
            
        }
    }*/



