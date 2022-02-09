package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class No2161 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> a = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			a.add(i);
		while(a.size() != 1) {
			sb.append(a.poll() + " ");
			a.offer(a.poll());
		}
		sb.append(a.poll());
		System.out.println(sb);
	}

}