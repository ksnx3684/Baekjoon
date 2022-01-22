package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[1000001];
		
		for(int i = 2; i <= 1000000; i++)
			arr[i] = i;
		for(int i = 2; i <= 1000000; i++) {
			if(arr[i] == 0)
				continue;
			for(int j = i + i; j < 1000000; j += i)
				arr[j] = 0;
		}
		for(int i = m; i <= n; i++) {
			if(arr[i] != 0)
				System.out.println(arr[i]);
		}
	}
}