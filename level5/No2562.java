package level5;
import java.util.Scanner;
public class No2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		int i = 0;
		int max = 1;
		int index = 0;
		for( ; i < 9; i++) {
			a[i] = sc.nextInt();
		}
		for(i = 0; i < 9; i++) {
			if(a[i] > max) {
				max = a[i];
				index = i+1;
			}
		}
		System.out.println(max+"\n"+index);
	}
}
