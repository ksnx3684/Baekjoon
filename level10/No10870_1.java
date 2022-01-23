package level10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No10870_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = fibonacci(n);
		System.out.println(r);
	}
	public static int fibonacci(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);	
	}
}