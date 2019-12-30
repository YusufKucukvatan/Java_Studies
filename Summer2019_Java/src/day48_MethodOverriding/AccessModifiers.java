package day48_MethodOverriding;

class Data{
	protected void method(){
		System.out.println("A");
		}
	double salary(double bonus) {
		return bonus+10_000;
	}
}

public class AccessModifiers extends Data{
//	private void methodA(){    //==> We cannot decrease the visibility of overridden method
//		System.out.println("B");
//		}
	@Override
	public void method(){   //==> But we can increase visibility
		System.out.println("A");
		}
	@Override
	double salary(double newBonus) {
		return newBonus+25_000;
	}

}
