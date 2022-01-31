package level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1436 {
	// int s로 666에서부터 1씩 증가하면서 문자열 666이 포함이 되어있을 경우 count 수를 증가시킨다
	// count의 수가 n과 같다면 해당 s의 이전 값을 출력한다
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int s = 666;
		while(n != count) {
			String a = String.valueOf(s);
			if(a.contains("666"))
				count++;
			s++;
		}
		System.out.println(s-1);
	}
}