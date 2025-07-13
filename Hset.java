import java.util.*;
public class Hset {
    /*public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search- contains
        if(!set.contains(1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        //size
        System.out.println(set.size());

        //printing set
        System.out.println(set);

        Iterator it= set.iterator();
        //first it will point to null then it.next() will give the first item of set
        //hashNext() will return boolean based on if next element exists or not in it iteration

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }*/

    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }
        for(int j=0;j<arr2.length;j++){
            if(!set.contains(arr2[j])){
                set.add(arr2[j]);
            }
        }

        System.out.println(set.size());
    }


}
