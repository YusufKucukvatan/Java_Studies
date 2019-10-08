package TutorialWeek3;

public class BreakAllLoops {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			boolean breakAll = false;
			for (int j = 1; j <= n; j++) {
				if (i * j > 50) {
					breakAll = true;
					break;
				}
				if(breakAll==true) {
					break;
				}
				System.out.println(i + "x" + (j) + "=" + (i * j));
			}
		}
	}

}
