package level5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine()); // 테스트 케이스 갯수 값 입력
		int sum = 0;
		int count = 0;
		int[] b = new int[N];
		for(int i = 0; i < N; i++) {
			String a = sc.readLine(); // OX 입력
			for(int j = 0; j < a.length() ; j++) { //String a의 길이만큼 반복
				String result = a.substring(j,j+1); // result에 문자하나씩 집어 넣으면서
				count++; // 문자길이세기
				while(count != 0) {
					if(result.equals("O")) {
						sum=sum+count; // 연속해서 맞출 수록 배점이 증가
						break;
					} else if (result.equals("X"))
						count = 0; // 틀리면 누적배점 초기화
				}
			}
			b[i] = sum; // 결과값 배열에 넣기
			sum = 0; // 초기화
			count = 0; // 초기화
		}
		for(int i = 0; i < N; i++)
			System.out.println(b[i]);
	}
}