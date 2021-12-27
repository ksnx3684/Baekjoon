package level3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class No2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(sc.readLine());
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++)
				bw.write("*");
			bw.write("\n");
		}
		bw.close();
	}
}