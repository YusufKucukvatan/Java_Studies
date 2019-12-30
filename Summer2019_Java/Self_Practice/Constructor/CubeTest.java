package Constructor;

public class CubeTest {

	public static void main(String[] args) {
		Cube cube1=new Cube();
		System.out.println("Cube-1 volume is "+cube1.volume());
	
		Cube cube2=new Cube();
		System.out.println("Cube-2 volume is "+cube2.volume());

		Cube cube3=new Cube(3,4,5);
		System.out.println("Cube-3 volume is "+cube3.volume());
		
	}
}
