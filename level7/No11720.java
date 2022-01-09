package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine());
		int sum = 0;
		char[] b = new char[N];
		b = sc.readLine().toCharArray();
		for(int i = 0; i < N; i++)
			sum = (b[i]-48) + sum;
		System.out.printf("%d", sum);
	}
}