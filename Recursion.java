public class Recursion {
    //no from 5 to 1
   /**  public static void main(String[] args) {
        int n=5;
        print(n);
       
    }
     public static void print(int n){
            System.out.println(n);
            if(n>1){
            print(n-1);
            }
            
        }*/

       /** public static void main(String[] args){
            int n=1;
            print(n);
        }
        public static void print(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print(n+1);
        }*/

        // sum of first n natural numbers
        /**public static void main(String[] args) {
            int n=1;
           System.out.println(sum(n)); 
        }
        public static int sum(int n) {
          if(n==11){
            return 0;
          }
          return n+sum(n+1); 
        }*/

        //factorial of a no n 
        /**public static void main(String[] args) {
            int n=5;
            System.out.println(fact(n));
        }
        public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
        }*/

       //fibo series using iteration
        /**public static void main(String[] args){
        int n=7;
        int count=2;
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        while(count<n){
        int temp=a+b;
        System.out.print(" "+temp);
        a=b;
        b=temp;
        count++;
        }
        }*/

        //fibo using recursion
         
        /**public static void main(String[] args) {
            int a=0;
            int b=1;
            int n=7;
            System.out.print(a+" "+b);
            fib(a,b,n-2);
       }
        
         public static void fib(int a, int b,int n){
        if(n==0){
            return;
        }
         int temp=a+b;
         System.out.print(" "+temp);
         fib(b,temp,n-1);
    }*/
    
    //print x^n(stack height=n)
    /**public static void main(String[] args) {
        int x=2;
        int n=6;
        int pow=1;
        power(x,n,pow);
    }
    public static void power(int x,int n,int pow) {
        if(n==0){
            System.out.println(pow);
            return;
        }
        pow=pow*x;
        
        power(x,n-1,pow);


    }*/

    /*public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(power(x,n));
    }
    public static int power(int x, int n) {
        
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    return x*power(x,n-1);

    }*/

  //x^n (stack height= logn)
  //Logic: if n is even: x^n = (x^n/2) * (x^n/2)....if n is odd: x^n= (x^n/2)*(x^n/2)*x
  /*public static void main(String[] args) {
    int x=10;
    int n=3;
    System.out.print(power(x,n));
  }
  public static int power(int x, int n){
  if(n==0){
  return 1;
  }
  if(n%2!=0){
   int pow1=power(x,n/2)*power(x,n/2)*x;
    return pow1;

  }
   int pow2=power(x,n/2)*power(x,n/2);
   return pow2;

  
  }*/
    

//Tower of Hanoi
/*public static void main(String[] args) {
    int n=3;
    String a="a";
    String b="b";
    String c="c";
toh(n,a,b,c);
}
public static void toh(int n, String a, String b, String c){
if(n>0){
    toh(n-1,a,c,b);
    System.out.println("Move disk "+n+" from "+a+" to "+c);
    toh(n-1,b,a,c);
}
}*/

//print the string "abcd" in reverse
/*public static void main(String[] args){
    String a= "abcd";
    int idx= a.length()-1;
    print(a,idx);

}
public static void print(String a, int idx) {
    if(idx>=0){
        System.out.print(a.charAt(idx));
        print(a,idx-1);
    }
    return;
    
}*/

// find the first and last occurance of an element in a string "abaacdaefaah"
/*public static int first=-1;
public static int last=-1;
public static void main(String[] args) {
String str="abaacdaefaae";
int idx=0;
char value='e';
find(str,value,idx);
}
public static void find(String str, char value, int idx){
if(idx>str.length()-1){
    System.out.println(first);
    System.out.println(last);
return;
}
if(str.charAt(idx)==value){
    if(first==-1){
        first=idx;
    }
    else{
        last=idx;
}
}
find(str,value,idx+1);
}*/

//Check if an array is sorted (strictly increasing ie cant have descending order or same number repeated like 1 2 3 4 4) 
/*public static void main(String[] args) {
    int arr [] = {1,2,3,4,4};
    int sidx=0;
    
    check(sidx,arr);
}
public static void check(int sidx, int arr[] ){
if(sidx==arr.length-1){
    System.out.println("Array is sorted!");
    return;
}
if(arr[sidx]<arr[sidx+1]){
    check(sidx+1,arr);
}
else{
    System.out.println("Array is not sorted");
}
}*/

// Move all x at the end of the string in "axbcxxd" such that we get abcdxxx
/*public static int xidx=-1;
public static void main(String[] args) {
    String str= "xxaaxxbbc";
    char val='x';
    StringBuilder sb= new StringBuilder(str);
    
    rearrange(sb,val,0);
}
public static void rearrange(StringBuilder sb, char val,int idx){
 if(idx==sb.length()){
    System.out.println(sb);
    return;
 }
 for(int i=idx;i<=sb.length()-1;i++){
    if(sb.charAt(i)==val){
        xidx=i;
        break;
    }}
    for(int j=xidx+1;j<=sb.length()-1;j++){
        if(sb.charAt(j)!=val){
            char temp= sb.charAt(j);
            sb.setCharAt(j,val );
            sb.setCharAt(xidx, temp);
            break;
        }
    }
     rearrange(sb, val, xidx+1);
 }*/

 // another try for the above prog
 public static void main(String[] args) {
    String str="xxabxxcd";
    int count=0;
    String newstr="";
    rearr(str,count,0,newstr);
 }
 public static void rearr(String str, int count,int idx,String newstr){
    if(idx==str.length()){
        for(int i=0;i<count;i++){
            newstr+='x';
        }
        System.out.println(newstr);
        return;
    }
    if(str.charAt(idx)=='x'){
        count+=1;
        rearr(str, count, idx+1, newstr);
    }
    else{
        newstr+=str.charAt(idx);
        rearr(str, count, idx+1, newstr);
    }
 }

 
}


