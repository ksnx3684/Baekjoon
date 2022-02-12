package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class No1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> a = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			a.add(i);
		}
		
		while(a.size() > 1) {
			for(int j = 0; j < k-1; j++)
				a.offer(a.poll());
			sb.append(a.poll()).append(", ");
		}
		sb.append(a.poll());
		
		System.out.println("<" + sb + ">");
	}

}