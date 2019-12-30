package Constructor;

public class Cube {

	int length;
	int width;
	int heigth;

	public Cube() {
		length=2;
		width=3;
		heigth=4;
	}
	public Cube(int l, int w, int h) {
		length=l;
		width=w;
		heigth=h;
	}
	public int volume() {
		return length*width*heigth;
	}

}
