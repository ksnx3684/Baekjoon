package level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1018 {

	// 8 X 8의 체스판을 만들기 위한 문제이며 모든 경우의 수를 생각해야 한다 (꽤나 많이 해맸던 문제이다)
	
	public static boolean a [][]; // 체스판은 흑과 백으로만 이루어져 있기 때문에 각 칸마다 이를 저장할 배열을 선언해준다 (boolean 배열)
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()); // n입력
		int m = Integer.parseInt(st.nextToken()); // m입력
		
		a = new boolean[n][m]; // 입력받은 n * m만큼 배열을 생성
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine(); // 입력 받은 문자열을 한 줄 씩 String s에 넣어주기
			for(int j = 0; j < m; j++) {
				if(s.charAt(j) == 'W') // 백 인 경우 true
					a[i][j] = true;
				else if(s.charAt(j) == 'B') // 흑 인 경우 false
					a[i][j] = false;
			}
		}
		
		// 체스판이 8 X 8이라고 가정한다면 체스판을 만들 수 있는 경우의 수는 첫 번째 칸이 흑 인 경우와 백 인 경우이기 때문의 경우의 수는 2이다
		// 그 다음 가로와 세로를 한 칸 씩 늘려 9 X 9로 입력을 받아보자
		// 기본 체스판 사이즈는 8 X 8이므로 모서리가 왼쪽 상단에 있는 경우, 오른쪽 상단에 있는 경우, 왼쪽 하단에 있는 경우, 오른쪽 하단에 있는경우
		// 이 4가지의 경우에 수에 첫째 칸이 흑 또는 백으로 나뉘는 경우도 생각하면 총 경우의 수는 8이다
		// 이 처럼 n과 m에 -7을 해주는 이유는 체스판의 최소 경우의 수가 나오는 8 X 8을 대입했을 경우 1, 1이 나오기 때문이다
		// n과 m에 8을 넣어보자. 그러면 for문의 탐색 경우의 수가 i에서 1, j에서 1, 둘의 곱이 1로 나오며 흑백을 가정하여 2를 곱하면 경우의 수는 2가 나오며,
		// 9를 넣어보면 i에서 2, j에서 2, 둘의 곱이 4로 나오고 흑백을 가정하여 2를 곱하면 경우의 수는 8이 나온다
		for(int i = 0; i < n - 7; i++) {
			for(int j = 0; j < m - 7; j++) {
				result(i,j);
			}
		}
		System.out.println(min);
	}
	
	public static void result(int n, int m) { // 위에서 입력받은 n, m을 매개 변수로 받는다
		int count = 0; // count를 0으로 초기화
		boolean z = a[n][m]; // 비교를 위해 boolean z를 선언하여 이곳에 배열 a의 참, 거짓 정보를 넣는다(백이라면 참, 흑이라면 거짓)
		
		// z의 정보와 a[i][j]의 정보를 비교하여 다르면 count를 1증가 시킨다 (처음 비교 시에는 무조건 정보가 같다)
		for(int i = n; i < n+8; i++) {
			for(int j = m; j < m+8; j++) {
				if(z != a[i][j]) { // 체스판 처럼 교차식으로 나오지 않는다면 count 1증가
					count++;
				}
				z = !z; // 체스판의 규칙처럼 만약 처음에 흑이 나왔다면 다음엔 백이 나오는 식으로 교차되야 하기 때문에  boolean z의 값을 반대로 바꾸어준다
			}
			z = !z; // 위에서 한 줄이 끝났기 때문에 다음 줄의 시작점의 색은 윗 줄의 시작점의 색과 달라야 한다
		}
		// 첫 번째 칸을 기준으로 할 때 바꿔야 할 수는 count
		// 첫 번째 칸의 색이 반대일 때 기준으로 할 때 바꿔야 할 수는 64-count
		count = Math.min(count, 64-count);
		// count값이 min보다 더 작을 경우 min값 갱신
		min = Math.min(min, count);
	}

}
