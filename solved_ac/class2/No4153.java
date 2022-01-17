package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class No4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int[] num = new int[3];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(i = 0; i < 3; i++)
				num[i] = Integer.parseInt(st.nextToken());
			i = 0;
			if(num[i] == 0 && num[i+1] == 0 && num[i+2] == 0)
				break;
			Arrays.sort(num);
			if(num[i+2]*num[i+2]==num[i]*num[i]+num[i+1]*num[i+1])
				sb.append("right\n");
			else
				sb.append("wrong\n");
		}
		System.out.println(sb);
	}
}