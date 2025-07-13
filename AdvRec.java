import java.util.*;
public class AdvRec {
    //Permutation of a String
    /*public static void main(String[] args){
        String str="abc";
        perm(str,"");
    }
    public static void perm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            perm(newstr,permutation+currchar);
        }
    }*/

// Count Path Maze
/*public static void main(String[] args){
    int m=3,n=3;
    int count=pathcount(m,n,0,0);
    System.out.println(count);
}
public static int pathcount(int m,int n,int i,int j){
    if(i==m||j==n){
        return 0;
    }
    if(i==m-1&&j==n-1){
        return 1;
    }
int downpath=pathcount(m,n,i+1,j);
int rightpath=pathcount(m,n,i,j+1);
return downpath+rightpath;
}*/

//Place 1Xm tiles in nXm floor
public static void main(String[] args) {
System.out.println(place(3, 3));
    
}
public static int place(int n, int m){
    if(n<m){
        return 1;
    }
    if(n==m){
        return 2;
    }
    int horizontal=place(n-1,m);
    int vertical=place(n-m,m);
    return horizontal+vertical;
}

//calling n guests either single or in pairs
/*public static void main(String[] args) {
    System.out.println(call(4));
}
public static int call(int n){
    if(n<=1){
        return 1;
    }
    int way1=call(n-1);
    int way2=(n-1)*call(n-2);
    return way1+way2;
}*/

//print all subsets of first n natural numbers
/*public static void main(String[] args) {
    int n=3;
    String str="";
    for(int i=1;i<n+1;i++){
      str+=i;
    }
    subset(str,0,"");

    
}
public static void subset(String str, int idx,String sub){
    if(idx==str.length()){
        System.out.println(sub);
        return;
    }
  
        subset(str,idx+1,sub+str.charAt(idx));
        subset(str,idx+1,sub);
  
}*/

//other approach
public static void main(String[] args) {
    int n=3;
    Arraylist<Integer>subset=new Arraylist<>();
    sub(n,subset);
}
public static void sub(int n, Arraylist<Integer>subset){
     if(n==0){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
        return;
     }
     subset.add(n);
     sub(n-1, subset);
     subset.remove(subset.size()-1);
     sub(n-1,subset);

}
}

