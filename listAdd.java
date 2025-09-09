import java.util.Arrays;

public class listAdd {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9, 11 };
		int[] neww = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			neww[i] = (arr[i] - 1) + (arr[i] + 1);
		}
		System.out.print(Arrays.toString(neww));
	}
}