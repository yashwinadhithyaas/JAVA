public class largestDigitInArray {
	public static void main(String[] args) {
		double[] arr = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
		double largest = arr[0];
		for (double num : arr) {
			if (largest < num) {
				largest = num;
			}
		}
		System.out.println(largest);
	}
}