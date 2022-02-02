package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Math.min(a, b); int min = 0;
		for(int i = 1; i <= c; i++) {
			if(a % i == 0 && b % i == 0) {
				min = i;
			}
		}
		int max = (a * b) / min;
		System.out.println(min);
		System.out.println(max);
	}

}
