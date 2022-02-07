package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class No10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> a = new Stack<>();
		for(int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n != 0)
				a.push(n);
			else
				a.pop();
		}
		for(int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		System.out.println(sum);
	}

}