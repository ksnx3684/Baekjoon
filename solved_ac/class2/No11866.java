package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class No11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		LinkedList<Integer> a = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			a.add(i);
		while(a.size() > 1) {
			for(int i = 0; i < k-1; i++) {
				int b = a.poll();
				a.offer(b);
			}
			sb.append(a.poll()).append(", ");
		}
		sb.append(a.poll());
		System.out.println("<"+ sb + ">");
	}

}