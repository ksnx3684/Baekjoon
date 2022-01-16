package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2839_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		while(n > 0) { // n이 0이하가 될때까지 반복
			if(n % 5 == 0) { // 5로 나누어 떨어지면
				n -= 5;
				count++;
			} else if(n % 3 == 0) { // 3으로 나누어 떨어지면
				n -= 3;
				count++;
			} else if(n > 3) { // 3이나 5로 나누어 떨어지지 않으면서 3 이상인 경우
				count++;
				n -= 3;
			} else {
				count = -1;
				break; // 탈출
			}
		}
		System.out.println(count);
	}
}