package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int M = 0;
		int a;
		double sum = 0;
		double result;
		int N = Integer.parseInt(sc.readLine());
		StringTokenizer st = new StringTokenizer(sc.readLine(), " ");
		for(int i = 0; i < N; i++) {
			a = Integer.parseInt(st.nextToken());
			if(a > M)
				M = a;
			sum += a;
		}
		result = sum/M*100/N;
		System.out.println(result);
	}
}