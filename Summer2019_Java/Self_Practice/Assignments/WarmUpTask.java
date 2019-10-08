package Assignments;

public class WarmUpTask {
	public static void main (String[] args) {
		/* Cucumber => $2.50
		 * Onion    => $1.50
		 * Tomato   => $3.00
		 */
		float cucumber1 = 2.50F;
		float inion1 = 1.50F;
		int tomato1 = 3;		
		
		System.out.println("Price of the cucumber is $"+cucumber1);
		System.out.println("Price of the inion is $"+(cucumber1-1));
		System.out.println("Price of the tomato is $"+(inion1+1.5));
		System.out.println("Price of the tomato is $"+tomato1);
		System.out.println("Thank you for shopping at Kucukvatan Market");
		
		System.out.println("=====================================");
		
		short zucchini1 = 4;
		double potato1 = zucchini1 + 2;
		int spinach1 = zucchini1 - 2;
		float spinach2 = (float)potato1;
		double parsley1 = spinach1 + .5;
		char leek1 = 'B';
		int leek2 = leek1;
		int carrot1 = leek1 - 10;
		float melon1 = leek1 + 12.5F;
		float watermelon1 = melon1  - 26.5F;
		double watermelon2 = melon1 - 26.5;
		float watermelon3 = 52;
		double watermelon4 = 52;
		long watermelon5 = 52;
		long watermelon6 = 52L;
		float watermelon7 = melon1+melon1+1;
		float watermelon8 = melon1+melon1+.5F;
		boolean comparison1 = parsley1 > spinach1; 
		boolean comparison2 = zucchini1 > leek1;
		boolean x = true;
		System.out.println(x);
		
		System.out.println("Price of the zucchini is $"+zucchini1); // $4
		System.out.println("Price of the potato is $"+potato1); // $6
		System.out.println("Price of the spinach is $"+spinach1); // $2
		System.out.println("Price of the parsley is $"+parsley1); // $2.5
		System.out.println("Price of the leek1 is $"+('B')); // $B BNOTE:We can not print char variable, only can use char to assign to other primitive variables. 
		System.out.println("Price of the leek2 is $"+leek1); // $B NOTE:We can not print char variable, only can use char to assign to other primitive variables.
		System.out.println("Price of the leek3 is $"+ 'B');  // $B  NOTE:We can not print char variable, only can use char to assign to other primitive variables.
		System.out.println("Price of the leek3 is $"+leek2); // Lesson learned: You can use char value for declaring and calculating in the other primitive types as a number (except boolean), //
		                                                     //  however you can not use char as a calculation element in println system.
		System.out.println("Price of the carrot is $"+carrot1); // $56 
		System.out.println("Price of the melon is $"+melon1);  // $78.5
		System.out.println("Price of the watermelon1 is $"+watermelon1);  // $52.0
		System.out.println("Price of the watermelon2 is $"+watermelon2);  // $52.0
		System.out.println("Price of the watermelon3 is $"+watermelon3);  // $52.0
		System.out.println("Price of the watermelon4 is $"+watermelon4);  // $52.0
		System.out.println("Price of the watermelon5 is $"+watermelon5);  // $52
		System.out.println("Price of the watermelon6 is $"+watermelon6);  // $52
		System.out.println("Price of the watermelon7 is $"+watermelon7);  // $158.0
		System.out.println("Price of the watermelon8 is $"+watermelon8);  // $157.5
		System.out.println("Thank you for shopping");
		System.out.println(leek1);  // B
		System.out.println(comparison1);  // True
		System.out.println(comparison2);  // False
		
		
		
		System.out.println("\n=================================================================\n");
		
		
		char char1 = 'C';
		char char2 = 67;
		char my_char = '2'; // It doesn't show anything after running if I initialize with any ASCII table number such 89. 
		int int1 = 'C' - 20;
		int int2 = char1 - 20;
		int int3 = char1 - char2; 
		int int4 = 'B';
		char char3 = '@';
		char char4 = 127;
		char char5 = 128;
		
		System.out.println(int1); //47
		System.out.println(int2); //47
		System.out.println(char1); //C
		System.out.println(char2); //C
		System.out.println(my_char); //2
		System.out.println(int3); //0
		System.out.println(int4); //66
		System.out.println(char3); //@
		System.out.println(char4); //Investigate the reason why it didn't work.
		System.out.println(char5); //Investigate the reason why it didn't work.
		
		System.out.println("\n================================================\n");
		
		String str1 = "You can type here whatever you want even some spaecial characters uch as !, #, ^, &, etc.";
		String str2 = "CyberTek" + "School";
		String name = "Yusuf"; 
		String cucumber = "Price of the cucumber is $" + cucumber1;
		String str3 = "1"+1+1;
		//String str4 = 10+11+12;
		String str5 = "1"+(1+1);
		String str6 = 1+("1"+1);
		//String str7 = 3+3;
		//String str8 = 3+'3';
		String str9 = '3'+"3"+3;
		//String str10 = '3'+3;
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("My name is " + name + ".");
		System.out.println(cucumber);
		System.out.println(str3);
		//System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		//System.out.println(str7);
		//System.out.println(str8);
		System.out.println(str9);
		//System.out.println(str10);
		
		System.out.println("\n============================\n");
		
		System.out.println(1+1+1);//3
		System.out.println("1"+4);//14
		System.out.println("1"+4+4);//144
		System.out.println("1"+(4+4));//18
		System.out.println("Batch_12"+3+4);//Batch_1234
		System.out.println("Batch_12"+(3+4));//Batch_127
		System.out.println(1+2+3+"Batch_12"+(3+4));//6Batch_127
		System.out.println('3'+3); //'3' is refer to 51 in ASCII table and result is like 51+3=54
		System.out.println('3'+"3"); // In this case '3' behaves as it is char value (means it is 3) because there is any " " within the print line.
		System.out.println('3'+1+"3"); // In this case '3' behaves as it is char value (means it is 3) because there is any " " within the print line.
		
		
		System.out.println("\n=====================================\n");
		
		
		
	//I couldn't run this method. investigate the reasons?
													 //When I relocate under the main method it works.
		
		char char11 = 'C';//C
		int int11 = char1-20;//47
		System.out.println(int1);
		System.out.println(char11);
		

		
	}
}
