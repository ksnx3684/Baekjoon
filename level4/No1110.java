package level4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(sc.readLine()); // 숫자 입력 26
		int D = N; // 26 복사
		while(true){
			N = ((N%10)*10)+((N/10+N%10)%10);
			count++;
			if(N == D)
				break;
		}
		System.out.println(count);
	}
}