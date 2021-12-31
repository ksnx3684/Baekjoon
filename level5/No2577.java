package level5;
import java.util.Scanner;
public class No2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b*c;
		int[] res = new int[10];
		
		while(sum != 0) {
			res[sum%10]++;
			sum/=10;
		}
		for(int result : res) {
			System.out.println(result);
		}

	}

}
