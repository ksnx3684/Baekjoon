package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.replace("c=","a");
		s = s.replace("c-","a");
		s = s.replace("dz=","a");
		s = s.replace("d-","a");
		s = s.replace("lj","a");
		s = s.replace("nj","a");
		s = s.replace("s=","a");
		s = s.replace("z=","a");
		System.out.println(s.length());
	}
}