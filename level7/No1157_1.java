package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1157_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String name = (sc.readLine());
		String a = name.toUpperCase(); // 입력문자 대문자로 변환
		int[] count = new int[26]; // A ~ Z까지의 횟수를 담는 배열
		for(int i = 0; i < a.length(); i++) {
				char b = a.charAt(i);
				count[b - 65]++; // 배열count에 직접 아스키값 대입
		}
		int max = 0;
		char d = '?';
		for(int j = 0; j < 26; j++) {
			if(max<count[j]) {
				max=count[j];
				d = (char)(j+65);
			} else if(max==count[j]) {
				d = '?';
			}
		}
		System.out.println(d);
	}
}