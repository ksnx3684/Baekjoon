package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;
			if(n == 1) {
				sb.append(1).append("\n");
				continue;
			}
			int[] a = new int[2*n+1];
			int count = 0;
			for(int i = 2; i <= 2*n; i++) {
				a[i] = i;
			}
			for(int i = 2; i <= 2*n; i++) {
				if(a[i] == 0)
					continue;
				if(i > n)
					count++;
				for(int j = i+i; j <= 2*n; j += i) {
					a[j] = 0;
				}
			}	
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}