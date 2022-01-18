package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1978_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			int count = 0;
			int num = Integer.parseInt(st.nextToken());
			for(int j = 1; j <= num; j++) {
				if(num % j == 0)
					count++; // 나누어 떨어지는 횟수
			}
			if(count == 2) // 소수는 1과 자기 자신으로밖에 나누어 떨어지지 않는다. (나누어 떨어지는 횟수 2)
				result++; // 소수 갯수 증가
		}
		System.out.println(result);
	}
}