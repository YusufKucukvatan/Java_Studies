package Constructor;

public class Elevator {
	int floor;
	boolean door;
	boolean call;
	
	public Elevator() {
		
	}
	public void callElevator() {
		call=true;
	}
	public void closeDoor() {
		door=false;
	}
	public void openDoor() {
		door=true;
	}
	public void setFloor(int newFloor) {
		if(floor>=0&&floor<=10)
		floor=newFloor;
	}
	
	
}
