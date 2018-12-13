import java.util.Arrays;

public class GradeBook {
	public static void main (String[] args) {
		int[] arr = {9, 5, 4, 3, 7};
		System.out.println(gradeTotal(arr));
		int[][] arr2d = {{10, 10, 9, 10, 9, 10}, {7, 6, 4, 8, 8, 5}, {8, 9, 7, 8, 8, 7}, {0, 0, 2, 3, 0, 2}};
		int[] arrTotal = (classTotal(arr2d));
		System.out.println(Arrays.deepToString(arr2d));
		System.out.println(Arrays.toString(arrTotal));
		System.out.println(numPassing(arr2d));
	}
	public static int gradeTotal (int[] grades) {
		int sumGrades = 0;
		for (int i = 0; i < grades.length; i++) {
			sumGrades += grades[i];
		}
		return sumGrades;
	}
	
	public static int[] classTotal(int[][] classroom) {
		int[] totals = new int[classroom.length];
		for(int i = 0; i < classroom.length; i++) {
			totals[i] = gradeTotal(classroom[i]);
		}
		return totals;
	}
	
	public static int numPassing(int [][] classroom) {
		int passed = 0;
		int[] studentScores = classTotal(classroom);
		for (int i = 0; i < studentScores.length; i++) {
			if (studentScores[i] >= 30) {
				passed++;
			}
		}
		return passed;
	}
}
