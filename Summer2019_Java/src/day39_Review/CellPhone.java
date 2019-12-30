package day39_Review;

import java.util.Scanner;

public class CellPhone {
	String brand;
	String model;
	String color;
	double screensize;
	static double price;
	
	public CellPhone() {
	}
	
	public CellPhone(String brand, double price, String color, double screensize, String model) {
		this.brand = brand;
        this.price = price;
        this.color = color;
        this.screensize = screensize;
        this.model = model;
        
    }
	
	public void phoneID() {
		System.out.println("Phone is "+brand+" "+model);
		System.out.println("Color is "+color);
		System.out.println("Screen size is "+screensize);
		System.out.println("Price is $"+price);
	}
	
	public void call(long outGoingNumber) {
		System.out.println(brand+" "+model+" is calling "+outGoingNumber);
	}
	public String sendMessage(long phoneNumber) {
		System.out.println("Please enter your message: ");
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		System.out.println(brand+" "+model+" is sending your message to "+phoneNumber);
		return text;
	}
	
}
