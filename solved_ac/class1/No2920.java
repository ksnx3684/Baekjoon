package solved_ac.class1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class No2920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> a = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8"));
		ArrayList<String> d = new ArrayList<>(Arrays.asList("8","7","6","5","4","3","2","1"));
		for(int i = 0; i < 8; i++) {
			String s = st.nextToken();
			arr.add(s);
		}
		if(arr.equals(a))
			System.out.println("ascending");
		else if (arr.equals(d))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}