package level10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n == 0)
			System.out.println(0);
		else if(n == 1)
			System.out.println(1);
		else {
			int[] s = new int[n+1];	
			s[0] = 0;
			s[1] = 1;
			for(int i = 2; i <= n; i++) 
				s[i] = s[i-2] + s[i-1];
			System.out.println(s[n]);
		}
	}
}