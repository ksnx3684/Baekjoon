package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class No1158_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> a = new LinkedList<>();
		
		for(int i = 1; i <= n; i++)
			a.add(i);
		
		int i = 0;
		while(n > 0 && a.size() > 1) {
			i = (i + k - 1) % n;
			sb.append(a.remove(i)).append(", ");
			n--;
		}
		sb.append(a.remove(0));
		
		System.out.println("<" + sb + ">");
	}

}