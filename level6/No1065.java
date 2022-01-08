package level6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(sc.readLine()); // N값 입력
		if(N >= 1 && N < 100) { // 1 ~ 99까지는 모두 등차수열이다.
			for(int i = 0; i < N; i++)
				count++;
		} else if (N >= 100 && N <= 1000) {// 100 ~ 1000
			count = 99;
			for(int i = 100; i <= N; i++) {
				if((i/100) - (i%100/10) == (i%100/10) - (i%100%10))
					count++;
			}
		}
		System.out.println(count);
	}
}