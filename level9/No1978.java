package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num == 1)
				continue;
			if(num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 ||
					 num == 19 || num == 23 || num == 29 || num == 31) {
				count++;
				continue;
			}
			if(num%2 != 0 && num%3 != 0 && num%5 != 0 && num%7 !=0 && num%11 !=0 && num%13 !=0
					&& num%17 !=0 && num%19 !=0 && num%23 !=0 && num%29 !=0 && num%31 !=0)
				count++;
		}
		System.out.println(count);
	}
}