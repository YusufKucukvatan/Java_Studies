package TutorialWeek5;

public class Blocks {
	static int num1=3;
	int num2=5;
	
	public Blocks(){
		System.out.println("Constructor-1");
	}
	public Blocks(int a){
		System.out.println("Constructor-2");
	}
	
	{
		System.out.println("Instance block-1");
	}
	static{
		System.out.println("Static block-1");
		
	}
	{
		System.out.println("Instance block-2");
		
	}
	static {
		System.out.println("Static block-2");
		
	}
	public static void main(String[] args) {
	Blocks obj1=new Blocks();
	Blocks obj2=new Blocks();
	Blocks obj3=new Blocks(3);
	Blocks obj4=new Blocks(3);
	}
	
}
