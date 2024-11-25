import java.util.*;
public class Sorting {

    //Bubble Sort
       /**  public static void main(String[] args) {
        int arr []= new int [10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n= sc.nextInt();
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
           for(int j=0;j<((n-i)-1);j++){
             if(arr[j]>arr[j+1]){
                int temp= arr[j+1];
                arr[j+1]= arr[j];
                arr[j]= temp;
            }
           }
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }


        
    }*/

    //Selection Sort
    /**public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        
        int n= arr.length;
        for(int i=0;i<n-1;i++){
              int small=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[small]){
                small=j;
                 
            }
        }
        int temp=arr[i];
        arr[i]=arr[small];
        arr[small]=temp;

        
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }*/

    //Insertion sort
    public static void main(String[] args) {
         int arr[]={7,8,3,1,2};
        int n= arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
        while(j>=0&&temp<arr[j]){  
                arr[j+1]=arr[j];
                j--;
        }
        arr[j+1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
