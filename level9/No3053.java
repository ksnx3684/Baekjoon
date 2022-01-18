package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		System.out.printf(String.format("%.6f",Math.PI*r*r)+"\n");
		System.out.printf(String.format("%.6f",((r*2)*(r*2))/2));
	}
}