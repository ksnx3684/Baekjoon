package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(sc.readLine()); // 테스트 케이스의 갯수
		StringTokenizer st; // StringTokenizer타입 변수 선언
		float[] all = new float[C];
		for(int i = 0; i < C; i++) {
			int sum = 0;
			int count = 0;
			float percent = 0f;
			st = new StringTokenizer(sc.readLine()," "); // 학생 수, 성적 입력을 위한 객체 생성
			int N = Integer.parseInt(st.nextToken()); // 학생 수 입력
			int[] b = new int[N]; // 학생 수 만큼의 성적을 담을 배열 b 선언 및 객체 생성
			for(int k = 0; k < N; k++) {
				int a = Integer.parseInt(st.nextToken()); // 성적 입력
				b[k] = a;
				sum = sum + a;
			}
			double avg = (float)(sum/N);
			for(int j = 0; j < N; j++) {
				if(b[j] > avg) { // 성적이 평균을 넘으면
					count++; // 평균을 넘는 성적의 갯수를 증가
				}
			}
			percent = (count%N)*(100/(float)N); // 백분율로 계산
			all[i] = percent;
		}
		for(int i = 0; i < C; i++) {
			System.out.println(String.format("%.3f", all[i])+"%");
		}
	}
}