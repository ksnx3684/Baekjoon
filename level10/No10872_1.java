package level10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No10872_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = factorial(n);
		System.out.println(r);
	}
	public static int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		return n * factorial(n-1);
	}
}