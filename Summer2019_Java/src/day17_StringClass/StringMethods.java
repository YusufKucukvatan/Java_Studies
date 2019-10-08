package day17_StringClass;

import java.util.Scanner;

public class StringMethods {
	

		    public static void main(String[] args) {
		    	
		    	Scanner scan=new Scanner(System.in);

    System.out.println("Enter Item1 and its price:");
    String item1=scan.nextLine();
    
    double price1=scan.nextDouble();
    System.out.println("Enter Item2 and its price:");
    
    String item2=scan.nextLine();
    scan.nextLine();
    double price2=scan.nextDouble();
    System.out.println("Enter Item3 and its price:");
    
    String item3=scan.nextLine();
    scan.nextLine();
    double price3=scan.nextDouble();
    
    double totalprice=price1+price2+price3;
    String report="Item1: "+item1+"Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;
    String report1="Total price: "+totalprice;
    
    System.out.println(report);
    System.out.println(report1);

	}

}
