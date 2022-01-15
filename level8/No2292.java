package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int plus = 6; // 증가량 (6씩 증가)
		int count = 1; // 거쳐간 방의 갯수
		int range = 1;
		while(range < n) {
			if(n == 1)
				break;
			range = range + plus;
			plus += 6;
			count++;
		}
		System.out.println(count);
	}
}