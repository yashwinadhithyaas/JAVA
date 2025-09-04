public class averageInArray {
	public static void main(String[] args) {
		double[] arr = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
		double sum = 0.0;
		for (double num : arr) {
			sum += num;
		}
		double average = sum / arr.length;
		System.out.println(average);
	}
}