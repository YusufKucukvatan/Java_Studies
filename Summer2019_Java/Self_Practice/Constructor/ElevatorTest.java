package Constructor;

public class ElevatorTest {
	public static void main(String[] args) {
		Elevator lift1=new Elevator();
		lift1.callElevator();
		lift1.openDoor();
		lift1.closeDoor();
		lift1.setFloor(3);
		lift1.openDoor();
		
		System.out.println("The elevator is at floor-"+lift1.floor);
		
	}
}
