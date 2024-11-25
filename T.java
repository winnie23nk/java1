/** Sum
 import java.util.*;
public class T {
    public static void printsum(int a, int b){
   System.out.println(a+b);

    }
    public static void main(String[] args) {
        System.out.println("Enter 2 no:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printsum(a,b);
    }
}**/

/** Factorial
 import java.util.*;
public class T{
    public static int findfact(int a){
        int fact=1;
        int i=1;
        while(i<=a){
             fact=fact*i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        int facto=findfact(5);
        System.out.println(facto);
    }
}**/

 /** GCD 
  import java.util.*;
public class T{
    public static int gcd(int a,int b){
        int rem,n,m;
        if(a>b){
             n=b;
             m=a;
        }
        else{
             n=a;
             m=b;
        }
        while(n!=0){
          rem=m%n;  
          m=n;
          n=rem;

    }
    return m;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 no:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int res=gcd(a,b);
        System.out.println(res);
    }
}**/


/** Exponent
 import java.util.*;
public class T{
    public static void exp(int a, int b){
        int exp=1;
        for(int i=1;i<=b;i++){
            exp=exp*a;
        }
        System.out.println(exp);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base:");
        int a= sc.nextInt();
        System.out.println("Enter the power:");
        int b= sc.nextInt();
        exp(a,b);
    }
}**/

//Palindrome
/**import java.util.*;
public class T{
    public static void isPalindrome(int a){
        int num=a;
        int rev=0;
        int rem;
        while(num!=0){
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        }
        if(a==rev)
        System.out.println("Number is a palindrome");
        else
        System.out.println("Number is not a palindrome");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        isPalindrome(a);
    }
}**/

//Fibonacci series
/**import java.util.*;
public class T{
    public static void fib(int a){
        int x=0;
        int y=1;
        int temp;
        System.out.print(x+" "+y);
        if(a>1){
        for(int i=1;i<=a;i++){
        temp=x+y;
        x=y;
        y=temp;
        System.out.print(" "+temp);
        }
        
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        fib(a);
    }
}**/


