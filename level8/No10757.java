package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken();
		int c = Math.max(a.length(), b.length());
		int[] aaa = new int[c+1];
		int[] bbb = new int[c+1];
		for(int i = a.length()-1, j = 0; i >= 0; i--, j++) {
			char aa = a.charAt(i);
			aaa[j] = aa-48;
		}
		for(int i = b.length()-1, j = 0; i >= 0; i--, j++) {
			char bb = b.charAt(i);
			bbb[j] = bb-48;
		}
		for(int i = 0; i < c; i++) {
			int sum = aaa[i] + bbb[i];
			aaa[i] = sum % 10; // 1의 자리에 a와 b의 합을 더한 값의 1의 자리 값을 넣는다
			aaa[i+1] += sum / 10; // 10의 자리에 a와 b의 합을 더한 값의 10의 자리 값을 넣는다
		}
		if(aaa[c] != 0)
			sb.append(aaa[c]);
		for(int i = c-1; i >= 0; i--)
			sb.append(aaa[i]);
		System.out.println(sb);
	}
}