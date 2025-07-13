import java.util.*;
public class ArrayL {
    public static void main(String[] args) {
       
        ArrayList<Integer>list=new ArrayList<>();

        //Adding elements:
        list.add(0);
        list.add(2);
        list.add(3);
        //Printing elements:
        System.out.println(list);
        
        //getting elements:
        int ele=list.get(0);
        System.out.println(ele);

        //Setting elements:
        list.set(0,1);
        System.out.println(list);

        //adding element in between:
        list.add(0,0);
        System.out.println(list);

        //deleting an element
        list.remove(0);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //Loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sort
        list.add(2);
        Collections.sort(list);
        System.out.println(list);




    }
}

    

