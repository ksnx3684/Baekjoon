package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(sc.readLine()); // 테스트 케이스 갯수 입력
		for(int i = 0; i < T; i++) {
			String[] a = sc.readLine().split(" "); // 문자를 담을 배열 생성 및 입력
			int R = Integer.parseInt(a[0]); // 문자의 반복 수 대입
			String S = a[1]; // 출력할 문자 대입
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.substring(j, j+1));
				}
			}
			System.out.println();
		}
	}
}