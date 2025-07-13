import java.util.*;
public class Hashmap {
    /*public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();

    //Insertion
    map.put("India",20);
    map.put("china",120);
    System.out.println(map); //values can be stored in jumbled way inside map

    map.put("china",180); //if i update it changes to the new value replacing the old
    System.out.println(map);
    
    // Search
    if(map.containsKey("lanka")){
        System.out.println("key exists");
    }
    else{
        System.out.println("key is not present");
    }

    System.out.println(map.get("china"));
    System.out.println(map.get("lanka"));


    //Traversal 

    int arr[]={12,13,14};
    for(int val: arr){
        System.out.println(val);
    }

    for(Map.Entry<String,Integer>e : map.entrySet()){
     System.out.println(e.getKey());
     System.out.println(e.getValue());
    }

    Set<String>keys=map.keySet();
    for(String key:keys){
        System.out.println(key+" "+map.get(key));
    }

     //removal of pairs
    map.remove("china");
    System.out.println(map);

    }*/


    // returning Travel itinerary(starting from first to last stop)

    public static String rev(HashMap<String,String>map){
    HashMap<String,String>rev=new HashMap<>();
    String start="";
    Set<String>keys=map.keySet();
    for(String key:keys){
        rev.put(map.get(key),key);
    }
    for(String key:keys){
        if(rev.containsKey(key)==false){
           start=key;
        }
    }
     return start;
    }
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("cyn","blr");
        map.put("bom","del");
        map.put("goa","cyn");
        map.put("del","goa");
        String start=rev(map);
       
        while(map.containsKey(start)){
            
            System.out.print(start+"->");
            start=map.get(start);

        }
        System.out.print(start);
      
        

    }
   
   
}
