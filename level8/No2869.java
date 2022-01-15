package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double[] n = new double[3]; // n[0]은 올라가는 높이 n[1]은 떨어지는 높이 n[2]는 목표높이
		double count1 = 0;
		int count2 = 0;
		for(int i = 0; i < 3; i++) {
			n[i] = Double.parseDouble(st.nextToken());
			count1 = Math.ceil((n[2]-n[0]) / (n[0]-n[1])) + 1;
			count2 = (int)count1;
		}
		System.out.println(count2);
	}
}