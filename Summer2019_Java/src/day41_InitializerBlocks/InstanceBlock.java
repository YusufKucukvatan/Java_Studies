package day41_InitializerBlocks;

public class InstanceBlock {
	static int num1;
	int num2;
	static int[] nums={1,2,3,4,5};
	
	{
		System.out.println("Instance Block-1");
		num1=3;
		num2=5;
		nums[4]=10;
	}
	{
		System.out.println("Instance Block-2");
	}
	static {
		System.out.println("Static");
	}
	public InstanceBlock() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		InstanceBlock obj1=new InstanceBlock();
		InstanceBlock obj2=new InstanceBlock();
		InstanceBlock obj3=new InstanceBlock();
		//System.out.println(Arrays.toString(nums));
	}
}
