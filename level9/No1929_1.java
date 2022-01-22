package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1929_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());		
		int[] c = new int[n+1];
		for(int i = 2; i <= n; i++)
			c[i] = i;		
		for(int i = 2; i <= n; i++) {
			if(c[i] == 0) // 소수가 아닌 수는 0으로 처리되었으므로 통과
				continue;
			if(i >= m) // 소수가 아닌 수는 바로 위의 조건문에서 걸러지고 소수인 수만 sb에 쌓인다. 
				sb.append(i).append("\n");
			for(int j = i+i; j <= n; j += i) {
				c[j] = 0; // 소수가 아닌 수는 0으로 처리
			}
		}
		System.out.println(sb);
	}
}