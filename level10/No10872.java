package level10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = 1;
		if(n == 0 || n == 1)
			r = 1;
		else {
			for(int i = 2; i <= n; i++) {
				r *= i;
			}	
		}
		System.out.println(r);
	}
}