package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 단어 갯수 입력
		int c; // 아스키코드
		int count = 0;
		for(int i = 0; i < n; i++) {
			String s = br.readLine(); // 문자열 입력 abc
			int b=0; // 직전 값
			boolean flag = true; // 중복 여부. false면 중복임
			boolean[] arr = new boolean[26]; // 초기상태 false. 처음나온 값이면 false 상태고, 이전에 나온 값이면 true 상태
			for(int j = 0; j < s.length(); j++) {
				c = s.charAt(j); // 문자열을 아스키코드로 변환
				if(b!=c) { // 직전 값이 현재 값과 같지 않다면 실행. 둘이 같다면 바로 위에 for문으로 돌아가서 문자열 계속 읽기
					if(arr[c-97] == false) { // 그리고 처음 나온 값이면
						arr[c-97] = true; // true로 상태 변경 후
						b = c; // 직전 값에 현재 값 넣기
					} else { // 처음 나온 값이 아니라면 중복이므로
						flag = false; // 중복 처리
						break; // 탈출
					}
				}
			}
			if(flag == true) // 중복이 아니라면
				count++; // 1증가
			else // 중복이면
				continue; // 계속 실행
		}
		System.out.println(count);
	}
}