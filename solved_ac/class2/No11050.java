package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No11050 {
	// level10의 No10872문제의 factorial 함수를 이용하면 쉽게 풀 수 있는 문제다
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(n) / (factorial(k) * factorial(n-k)));
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		
		return n * factorial(n-1);
	}

}