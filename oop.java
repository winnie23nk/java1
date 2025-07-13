


//Parameterized constructor
/*class Student{
String name;
int age;

public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
Student(String name,int age){
this.name=name;
this.age=age;
}
}
public class oop{
    public static void main(String[] args) {
        Student s1=new Student("tej",21);
        s1.printInfo();
    }
}*/


//Copy Constructor
/*class Student{
String name;
int age;

public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
}
Student(){

}
}
public class oop{
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="tej";
        s1.age=21;
        Student s2=new Student(s1);
        s2.printInfo();
}
}*/

//Polymorphism
//compile time polymorphism or function overloading
/*class Student{
String name;
int age;

public void printInfo(String name){
    System.out.println(name);
}
public void printInfo(String name,int age){
    System.out.println(name+" "+age);
}
public void printInfo(int age){
    System.out.println(age);
}



}
public class oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="tej";
        s1.age=21;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
        s1.printInfo(s1.name); 

    }
}*/

//Inheritance

//Single level Inheritance
 /*class Shape{
    String color;
}
 class Triangle extends Shape{
public void print(){
    System.out.println(this.color);
}
}
public class oop{
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="red";
        t1.print();
    }
}*/

//Multilevel Inheritance
/*class Shape{
    String color;
}
 class Triangle extends Shape{
public void print(){
    System.out.println(this.color);
}
}
class Equivilateraltriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
public class oop{
    public static void main(String[] args) {
        Equivilateraltriangle t1=new Equivilateraltriangle();
        t1.color="red";
        t1.print();
        t1.area(20,25);
    }
}*/

//Hierarchical Inheritance
/*class Shape{
    String color;
}
 class Triangle extends Shape{
public void print(){
    System.out.println(this.color);
}
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
        System.out.println(this.color);
    }
}
public class oop{
    public static void main(String[] args) {
        Circle c1= new Circle();
        Triangle t1= new Triangle();
        t1.color="yellow";
        c1.color="Black";
        c1.area(5);
        t1.print();
    }
}*/

// Another is hybrid inheritance which can combine all of them togerther

//packages
/*import Bank.Account;
public class oop{
public static void main(String[] args) {
    Account a1= new Account();
    a1.name="tej";
    System.out.println(a1.name);
}
}*/

//Access Modifiers
/*class Account{
    public String name;
    protected String email;
    private String password;

    public String getpassword(){//getter
        return this.password;
    }
    public void setpassword(String pass){//setter
     this.password=pass;
    }

}
public class oop{
    public static void main(String[] args){
        Account a1=new Account();
        a1.name="tej";
        a1.email="tej@gmail";
        a1.setpassword("abcd");
        System.out.println(a1.getpassword());
    }
}*/

//Abstraction
/*abstract class Animal{
    abstract public void walks();
    Animal(){
        System.out.println("Creating Animal");
    }
    protected void eats(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
   System.out.println("created Horse");
    }
    public void walks(){
        System.out.println("walks on 4 legs");
    }
}
class Chick extends Animal{
    public void walks(){
        System.out.println("walks on 2 legs");
    }
}
public class oop{
    public static void main(String[] args) {
        Horse h= new Horse();
        h.walks();
        h.eats();
    }
}*/

//interfaces
/*interface Animal{
void walks();
//interfaces cannot even define a normal method or constructor like we did using abstract
//it can just specify what function must exist
}
interface Herbivore{
    void eats();
}
class Horse implements Animal,Herbivore{//we dont write extends instead we write implements..it can also implement multiple interfaces and show the property of multiple inheritance

public void walks(){
    System.out.println("walks on 4 legs");
}
public void eats(){
System.out.println("eats plants");
}
}
public class oop{
    public static void main(String[] args) {
        Horse h= new Horse();
            h.eats();
            h.walks();
        
    }
}*/

// In java Multiple Inhertance is only possible through interfaces (This is a very important interview question)

//Static keyword is used when we wanna fix the value of something it can be used in front of variables and methods and even subclass or nested class
class Student{
    String name;
    static String school;
    static public void setschool(){
        school="newschool";
    }

}
public class oop{
    public static void main(String[] args) {
        Student.school="NVN";//since static variable is common for all and it is class specific it can accessed directly without creating object
        Student s1= new Student();
        s1.name="tej";
        System.out.println(s1.school);
    

    }
}
