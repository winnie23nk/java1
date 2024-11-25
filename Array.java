/**public class Array {
    public static void main(String[] args) {
        int []marks=new int[3];//u can also do int marks[]= new int[3]
        marks[0]=45;
        marks[1]=50;
        marks[2]=50;
        System.out.println(marks[0]);
         System.out.println(marks[1]);
          System.out.println(marks[2]);
    }
}**/
//Now, u can understand that string[] args or string args[] is basically an array args of type string to store the input values!

/**public class Array{
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
    }
}**/

/**import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int num[]= new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int y= sc.nextInt();
        for(int i=0;i<n;i++){
            if (num[i]==y){
                System.out.println("Number found at index "+i);
            }
            
        }
    }
}**/


//Homework Problems:

//1)Take name as input and display them:
/**import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        System.out.println("Enter the names:");
        String names[]= new String[n];
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<n;i++){
           System.out.println(names[i]);
        }
    }
}**/

//2) find max n min number in an array

/**public class Array{
    public static void main(String[] args) {
        int num[]={9,6,10,4,5};
        int max=num[0];
        int min=num[0];

        for(int i=0;i<num.length;i++){
        if(num[i]>max){
            max=num[i];
        }
        if(num[i]<min){
            min=num[i];
        }
        }
        System.out.println("Min= "+min+" Max= "+max);
    }
}**/

//3)Take an array of numbers as input and check if it is an array sorted in ascending order.
/**public class Array{
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        boolean isAscending= true;
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
            isAscending =false;
            break;
            }
            
        }
        if(isAscending==true){
                System.out.println("Ascending");
            }
            else
            System.out.println("not Ascending");
    }
}**/

//2D Arrays
//1) Take a 2D array as input and then print the indices of the occurence of the number searched

/**import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Rows and Cols:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]= new int [rows][cols];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched:");
        int x= sc.nextInt();
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(x==arr[i][j]){
                System.out.println("Element found at index "+i +j);
               }
            }
        }
    }
}**/

//2)Print the spiral order matrix as output for a given matrix of numbers. 
/**public class Array{
    public static void main(String[] args) {
        int arr[][]={
            {1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41},{15,55,59,63,68,70},{40,70,79,81,95,105}
        };

    }
}**/

//3)For a given matrix of N x M, print its transpose.
import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr [][]= new int [2][3];
        System.out.println("Enter the elements of 2 X 3 matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[j][i]+" ");
            }
System.out.println();
        }
    }
}



