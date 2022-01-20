package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 2; i <= n;) {
			if(n % i == 0) {
				sb.append(i+"\n");
				n = n / i;
			} else
				i++;
		}
		System.out.println(sb);
	}
}