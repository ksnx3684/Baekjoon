package level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No7568 {
	// 몸무게와 키에 대한 정보를 한 명씩 담을 수 있는 2차원배열을 선언한다
	// for문에서 i를 0부터 시작하여 차례대로 비교를 한다
	// i와 j가 같은 경우 동일인이므로 건너뛰고, 만약 j의 키와 몸무게가 더 크다면 i의 순위를 하나씩 낮춘다
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 전체 사람의 수 입력
		StringBuilder sb = new StringBuilder();
		int[][] a = new int[2][n]; // 사람의 수 만큼 몸무게, 키의 정보를 담을 배열 선언
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			a[0][i] = Integer.parseInt(st.nextToken()); // 몸무게
			a[1][i] = Integer.parseInt(st.nextToken()); // 키
		}
		for(int i = 0; i < n; i++) { // 첫 번째 사람부터 비교
			int rank = 1; // 최초 순위 1위 지정
			for(int j = 0; j < n; j++) {
				if(i == j) // 동일인끼리 비교이므로 pass
					continue;
				else if(a[0][i] < a[0][j] && a[1][i] < a[1][j]) // 키나 몸무게가 더 작다면
					rank++; // 순위 한 단계 down
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb);
	}

}
