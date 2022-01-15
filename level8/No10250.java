package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken()); // 높이 2
			int w = Integer.parseInt(st.nextToken()); // 폭 82
			int n = Integer.parseInt(st.nextToken()); // n번째 손님 18
			if(n % h == 0) {  // 높이가 최상층
				sb.append(h*100 + n/h).append("\n");
			} else { // 최상층 이외
				sb.append((h-(h-n%h))*100 + n/h+1).append("\n");
			}
		}
		System.out.println(sb);
	}
}