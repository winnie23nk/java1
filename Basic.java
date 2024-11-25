/**import java.util.*;
public class Basic {
    public static void main(String[] args) {
       1. System.out.println("Hello world");
        System.out.print("Hello world\n");// without ln u can give a new line start
        System.out.print("Hello world"); //prints without a new line
        operator precedence: *,/,%,+,- 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:"); 
       // String name = sc.next();this takes only one word because it takes only one token, every word is a token
        String name= sc.nextLine();//this will take entire name split as combination of words
        //lly use nextInt(), nextFloat() for taking numbers as input
        System.out.println(name);
    }
}**/

//Bit Manipulation
public class Basic{
  public static void main(String[] args) {
    //get
    /**int n=5;
    int pos=2;
    int bitmask=1<<pos;
    int num=bitmask&n;
    System.out.println(num);*/
   
    //set
   /**  int n=5;
    int pos=1;
    int bitmask=1<<pos;
    int num=bitmask|n;
    System.out.println(num);*/

    //clear
    /**int n=5;
    int pos=2;
    int bitmask=1<<pos;
    int newbitmask=~bitmask;
    int num=newbitmask&n;
    System.out.println(num);*/
   
    //update
    int n=5;
    int pos=1;
    int bitmask=1<<pos;
    int newbitmask=~bitmask;
    int val=1;
    if(val==0){
    int num=newbitmask&n;
    System.out.println(num);
    }
    else{
      int num= bitmask|n;
      System.out.println(num);
    }

  }
}
