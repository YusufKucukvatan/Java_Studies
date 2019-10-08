package ArraysMultiDimensional;

public class ExamGrades {
	public static void main(String[] args) {
		char[][] answers = { 
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } 
		};

		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		
		int correctCounter = 0;
		for (int i = 0; i < answers.length; i++) {
			correctCounter = 0;
			for (int j = 0; j < keys.length; j++) {
				if (keys[j] == answers[i][j]) {
					correctCounter++;
				}
			}
			System.out.println("Student-" + i + " has " + correctCounter + " rigth answers.");
		}
	}
}
