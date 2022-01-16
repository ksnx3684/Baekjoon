package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		int[][] num = new int[15][15]; // 사람 수
		for(int i = 0; i < 15; ++i) {
			for(int j = 0; j < 15; j++) {
				if(i == 0) // 0층이라면
					num[i][j] = j+1; // 0층 데이터 채우기
				else { // 1층 이상이라면
					for(int k = 1; k < 15; k++) {
						if(j == 0) // 1호라면
							num[k][j] = j+1; // 각 층의 1호의 데이터 채우기
						else
							break;
					}
					if(j < 14)
						num[i][j+1] = num[i][j] + num[i-1][j+1];
				}
			}
		}
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호
			sb.append(num[k][n-1]+"\n");
		}
		System.out.println(sb);
	}
}