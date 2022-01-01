package baekjoon;
import java.util.Scanner;
import java.util.HashSet;
public class No3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> a = new HashSet();
		for(int i = 0; i < 10; i++) {
			a.add(sc.nextInt()%42);
		}
		System.out.println(a.size());
	}
}