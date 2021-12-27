package level3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class No2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(sc.readLine());
		for(int i = N; i >= 1; i--) {
			for(int j = i - 1; j >= 1; j--)
				bw.write(" ");
			for(int j = 1; j <= N - i + 1; j++)
				bw.write("*");
			bw.write("\n");
		}
		bw.close();
	}
}