import java.util.Arrays;

public class GradeBook {
	public static void main (String[] args) {
		int[] arr = {9, 5, 4, 3, 7};
		System.out.println(gradeTotal(arr));
		int[][] arr2d = {{10, 6, 9}, {9, 2, 10}, {2, 3, 5}};
		int[] arrTotal = (classTotal(arr2d));
		System.out.println(Arrays.deepToString(arr2d));
		System.out.println(Arrays.toString(arrTotal));
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
}
