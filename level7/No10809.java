package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		char[] s = new char[100];
		int[] b = new int[100];
		int i = 0;
		s = sc.readLine().toCharArray(); // 배열 s에 입력한 영단어를 한 글자씩 넣기
		for(; i < s.length; i++) {
			b[i] = s[i]; // 배열 b에 복사하여 아스키코드값을 만들어냄
		}
		i = 0;
		int j = 96;
		while(j < 122) {
			j++;
			for(i = 0; i < s.length; i++) {
				if(b[i] == j) {
					System.out.print(i +" ");
					break;
				} else if(i == s.length-1) {
					System.out.print("-1 ");
				}
			}
		}
	}
}