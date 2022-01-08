package level6;
public class No15596_1 {
	public static void main(String[] args) {
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		long result = sum(b);
		System.out.println(result);
	}
	public static long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
}