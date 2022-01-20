package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		boolean flag = true;
		// 소수는 1과 자기 자신으로만 나누어 떨어지는 수. 즉, 나누어 떨어지는 횟수가 2인 수
		for(; m <= n; m++) { // m부터 n까지 하나씩 소수인지 검사
			int count = 0;
			for(int i = 1; i <= m; i++) { // 1부터 하나씩 증가시키면서 m을 나눈다
				if(m % i == 0)
					count++; // 모든 수는 1로 나누어 떨어지므로 반드시 count가 1 증가한다
				if(count > 2)
					break;
			}
			if(count == 2) { // 나누어 떨어지는 수가 2라면 소수
				sum += m; // 소수를 sum에 더한다
				while(flag) {
					min = m;
					flag = false;
				}
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}