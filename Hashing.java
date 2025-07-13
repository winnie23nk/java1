//Hashmaps are internally implemented in java as array of linked list
   // each index in the array of hashmap implemention is called bucket which stores nodes of linked list
   //there is a hashcode which is blackbox which converts each key we pass into the bucket index which will store that particular key value pair
   //let N denote no of buckets and let n denote no of nodes
   //hascode  returns values between 0 and N-1
   // lambda = n/N let lambda be 2 
   // if n/N becomes > 2 we do rehashing and increase the size of the array


//Java Implementation of HashMap

import java.util.*;
public class Hashing {
   static class HashMap<K,V>{
    
    private class Node{
        K key;
       V value;
       public Node(K key, V value){
        this.key=key;
        this.value=value;
       }
    }
    private int n;
    private int N;
    private LinkedList<Node>buckets[];
    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets= new LinkedList[N];
        for(int i=0;i<N;i++){
            this.buckets[i]=new LinkedList<>();
        }

    }

    private int hashFunction(K key){
    int bi= key.hashCode();
    return Math.abs(bi)%N;// because the value should lie b/w 0 to N-1(if we take remainder with 5 the values will lie between 0-4 same logic)
    }

    private int searchLL(K key, int bi){
        LinkedList<Node>ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).key==key){
                return i;
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node>oldbuckets[]=buckets;
        buckets= new LinkedList[N*2];
        for(int i=0;i<N*2;i++){
            buckets[i]= new LinkedList<>();
        }
        for(int i=0;i<oldbuckets.length;i++){
            LinkedList<Node>ll = oldbuckets[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);
            }
        }


    }

    public void put(K key, V value){
     int bi = hashFunction(key);
     int di= searchLL(key,bi);// returns -1 if not found
     if(di==-1){
        buckets[bi].add(new Node(key,value));
        n++;
     }
     else{
        Node node=buckets[bi].get(di);
        node.value=value;
     }
     double lambda= (double)n/N;
     if(lambda>2.0){
      rehash();
     }
    }

    public V get(K key){
        int bi= hashFunction(key);
        LinkedList<Node>ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            Node node= ll.get(i);
            if(node.key==key){
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key){
        int bi = hashFunction(key);
     int di= searchLL(key,bi);// returns -1 if not found
     if(di==-1){
       return false;
     }
     else{
        return true;
     }
    }

    public V remove(K key){
        int bi = hashFunction(key);
     int di= searchLL(key,bi);// returns -1 if not found
     if(di==-1){
        return null;
     }
     else{
        Node node=buckets[bi].remove(di);
        n--;
        return node.value;
     }
    }
    public boolean isEmpty(){
        return n==0;
    }

    public ArrayList<K>keySet(){
        ArrayList<K>keys=new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
            LinkedList<Node>ll=buckets[i];
            for(int j=0;j<ll.size();j++){
                Node node= ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }
   }


   public static void main(String args[]){
    HashMap<String,Integer>map= new HashMap<>();
    map.put("India",120);
    map.put("china",150);
    map.put("US",100);

    ArrayList<String>keys=map.keySet();
    for(int i=0;i<keys.size();i++){
        System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
    }
    map.remove("India");
   System.out.println( map.get("India"));
   }

}
