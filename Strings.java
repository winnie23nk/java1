//String and String methods

//Strings are immutable

//import java.util.*;
//public class Strings{
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
    }**/

  //  public static void main(String[] args) {
        //String methods:
        // Scanner sc=new Scanner(System.in);
        //1) Concatenation
          /**String fname=sc.nextLine();
            String lname=sc.nextLine();
            String fullName= fname+" "+lname;
            System.out.println(fullName);
         //2) length
         System.out.println(fullName.length());
         //3) charAt
         for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
         }**/

         //4) compare
         //String name1= "Tony";
         //String name2="Tony";
         /** name1.compareTo(name2)
          * will return 0 if name1==name2
          equation happens in terms of the weight of the alphabets used
          like hello > bello
          it returns +ve if name1>name2
          it returns -ve if name1<name2
          */
         /**  if(name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
          }
          else{
            System.out.println("Strings are not equal");
          }
 
          // This shows that == cannot be always used for string comparison, as it gives wrong input , hence use compareTo
          if(new String("tony")==new String("tony")){
            System.out.println("Strings are Equal");
          }
          else{
            System.out.println("Strings are not equal");
          }**/

          //substring
          //give substring(starting index, ending index) ending index is not considered and it prints till the value before ending index..if u give only one value then ending index becomes end of string
          /**String name="TonyStark";
          System.out.println(name.substring(4));
          System.out.println(name.substring(0,4));**/
   // }
//}

// Changing from string to integer and integer to string
/**public class Strings{
    public static void main(String[] args) {
        int num=123;
        String str= Integer.toString(num);
        System.out.println(str.length());

        String str="123";
        int num= Integer.parseInt(str);
        System.out.println(num);
    }
}**/

//Homework problems
//1)Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
/**import java.util.*;
public class Strings{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        System.out.println("Enter the size of strings array:");
        int n= sc.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            count=count+arr[i].length();
        }
        System.out.println(count);
    }
}**/

//2) Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//Example : 
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”

/**import java.util.*;
public class Strings{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.next();
        int len= str.length();
        String str2="";
        for(int i=0;i<len;i++){
            if(str.charAt(i)== 'e'){
             str2+="i";
            }
            else{
                str2+=str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}**/

//3)Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//Example : 
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//email = “helloWorld123@gmail.com”; username = “helloWorld123”

/**import java.util.*;
public class Strings{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your email:");
        String email= sc.nextLine();
        String username="";
        for(int i=0;i<email.length();i++){
        if(email.charAt(i)=='@'){
            break;
        }
        else{
            username+=email.charAt(i);
        }
        }
        System.out.println("Your username: "+username);
    }
}**/

// StringBuilder

public class Strings{
    public static void main(String[] args) {
       /**  StringBuilder sb = new StringBuilder("Tony");
        //charAt
        System.out.println(sb.charAt(0));

        //setCharAt
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //Insert (index to insert,value)
        sb.insert(0,'s');
        System.out.println(sb);

        //delete (starting index, ending index which is not included and values only before it are deleted)
        sb.delete(0,1);
        System.out.println(sb);*/

        /**StringBuilder sb= new StringBuilder("h");
        //append
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        //length
        System.out.println(sb.length());*/

        StringBuilder sb= new StringBuilder("hello");
        for(int i=0;i<(sb.length())/2;i++){
            int front =i;
            int back=sb.length()-(i+1);
            char fchar= sb.charAt(front);
            char bchar = sb.charAt(back);
            sb.setCharAt(front,bchar);
            sb.setCharAt(back,fchar);
            
        }
        System.out.println(sb);
    }
}