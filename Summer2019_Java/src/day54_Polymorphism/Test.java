package day54_Polymorphism;
interface Interface1{
	
	abstract void inter1();
	
}
interface Interface2 extends Interface1{
	abstract void inter2();
	
}

abstract class AbstractClass {
	
	abstract void abs();
}

public class Test extends AbstractClass implements Interface1, Interface2 {


	@Override
	public void inter2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inter1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void abs() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		//AbstractClass obj=new AbstractClass(); ==> You can not instantiate any object in Interface and Abstract Class
		
		AbstractClass obj=new Test();
		obj.abs();
		Interface1 obj1=new Test();
		obj.abs();
		Interface2 obj2=new Test();
		
		
		
	}
}
