package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String[] s = sc.readLine().split(" ");
		for(int i = 0; i < 2; i++) {
			StringBuffer sb = new StringBuffer(s[i]);
			String r = sb.reverse().toString();
			s[i] = r;
		}
		if(Integer.parseInt(s[0]) > Integer.parseInt(s[1]))
			System.out.println(s[0]);
		else
			System.out.println(s[1]);
	}
}