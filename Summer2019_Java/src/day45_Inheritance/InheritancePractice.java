package day45_Inheritance;


public class InheritancePractice extends  ParentClass {
    //  sub                         super   
/*
protected static String password ="1";
public static int age =12;
static double salary =1000000;
*/

public static void main(String[] args) {
//System.out.println(username); // private is not inheritable
System.out.println(password);
System.out.println( age );
System.out.println( salary );
salary=5000;
System.out.println(salary);
}
}