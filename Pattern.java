/**1) SUM:
 import java.util.*;
public class Code {
    
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first Number:");
         int a= sc.nextInt();
         System.out.println("Enter sec Number:");
         int b= sc.nextInt();
         int sum= a+b;
         System.out.println(sum);

    }
    
}**/ 
//PATTERN QUESTIONS
//rows- outer loops
//cols-inner loops

/**2) Solid Rectangle pattern with 4 rows and 5 columns
 public class Code{
    public static void main(String[]args){
        for(int j=0;j<4;j++){
       for(int i=0;i<5;i++){
        System.out.print("*");
       }
      System.out.print("\n");
    }
}
}**/


/** 3)Hollow Rectangle with 4 rows 5 columns
  public class Code{
    public static void main(String[]args){
        for(int j=0;j<4;j++){
        for(int i=0;i<5;i++){
            if((i!=0&&i!=4)&&(j!=0&&j!=3)){
                System.out.print(" ");
                continue;
                
            }
            System.out.print("*");
        }
        System.out.print("\n");

    }
}
}**/

/**  4) Half Pyramid
public class Code{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}**/

/**
 * 5) Inverted Half Pyramid
 public class Code{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}**/

/**6) Inverted Half Pyramid rotated by 180 deg
 * public class Code{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i+j>=3){
                    System.out.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}**/

/** 7) Half pyramid with numbers
 public class Code{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}**/

/**8) Inverted Half Pyramid with Numbers
public class Code{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}**/

/**  9) Floyd's Triangle
public class Code{
    public static void main(String[] args){
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.err.print(count++ + " ");
            }
            System.out.println();
        }

    }
}**/

/** 10) 0-1 Triangle
public class Code{
    public static void main(String[] args){
       
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}**/

/**11) Butterfly Pattern
public class Code{
    public static void main(String[] args) {
       for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(4-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
       } 
        for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(4-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
       } 
       
      
    }
        
    }**/

    /**12) Solid Rhombus
    public class Code{
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(i+j>=6){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(int j=1;j<=5-i;j++){
                    if(i==5){
                        break;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }**/

   /**  13) Number Pyramid
    public class Code{
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
               for(int j=4;j>=i;j--){
                System.out.print(" ");
               }
               for(int j=1;j<=i;j++){
                System.out.print(i+" ");
               } 
                System.out.println();
            }
        }
    }**/
   
    /**14) Palindromic pattern
    public class Code{
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int j=4;j>=i;j--){
                System.out.print(" ");
                }
               
                for(int j=i;j>=2;j--){
                    System.out.print(j);     
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
                  System.out.println();  
                }
               
            }
        }**/
        
        //15) Diamond
        public class Pattern{
            public static void main(String[] args) {
                for(int i=1;i<=4;i++){
                    for(int j=3;j>=i;j--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i+(i-1);j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i=4;i>=1;i--){
                    for(int j=3;j>=i;j--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i+(i-1);j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
      




