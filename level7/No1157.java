package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String name = (sc.readLine());
		int c;
		int i=0;
		int k=0; // 배열 count의 인덱스 변수
		String a = name.toUpperCase(); // 입력문자 대문자로 변환
		int[] count = new int[26]; // A ~ Z까지의 횟수를 담는 배열
		for(; i < a.length();) {
			for(int j = 65; j < 91;) {
				char b = a.charAt(i);
				c = b; // 아스키코드로 변환
				if(c==j) { // 찾으면
					count[k] = count[k]+1; // 해당 인덱스의 값을 1증가
					i++; // 다음 문자 검색
					j = 65;
					k = 0;
					if(i==a.length())
						break;
				}
				else {
					j++;
					k++;
				}
			}
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