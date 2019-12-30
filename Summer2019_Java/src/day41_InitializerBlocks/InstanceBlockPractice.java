package day41_InitializerBlocks;

public class InstanceBlockPractice {
	public String name = "Defne";
	public InstanceBlockPractice(){
		name="Ali";
	}
	{
		name="Murat";
	}
	{
		name="Ela";
	}
	{
		name="Yusuf";
	}


	public static void main(String[] args) {
		InstanceBlockPractice obj1 = new InstanceBlockPractice();
		obj1.name="John";
		System.out.println(obj1.name);
		
		InstanceBlockPractice obj2 = new InstanceBlockPractice();
		System.out.println(obj2.name);
	}

}
// First executes instance blocks in order. 
// Then when constructor execute by creating object it assigns the value in constructor.
// If we assign another value to the name, it prints that name.