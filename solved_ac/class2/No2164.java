package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class No2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> a = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			a.add(i);
		while(a.size() != 1) {
			a.add(a.get(1));
			a.remove(0); a.remove(1);
		}
		System.out.println(a.get(0));
	}

}