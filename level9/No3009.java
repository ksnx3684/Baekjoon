package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] a = new int[3][2];
		int[] result = new int[2];
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < 2; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
			if(a[0][0] == a[1][0])
				result[0] = a[2][0];
			else if(a[0][0] == a[2][0])
				result[0] = a[1][0];
			else
				result[0] = a[0][0];
			
			if(a[0][1] == a[1][1])
				result[1] = a[2][1];
			else if(a[0][1] == a[2][1])
				result[1] = a[1][1];
			else
				result[1] = a[0][1];
			
			System.out.println(result[0] + " " + result[1]);
	}
}