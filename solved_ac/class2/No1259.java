package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1259 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String n = br.readLine();
			if(n.equals("0"))
				break;
			char[] a = new char[n.length()];
			for(int i = 0; i < n.length(); i++)
				a[i] = n.charAt(i);
			for(int i = 0, j = 1; i <= n.length()/2; i++, j++) {
				if(i == n.length()/2)
					sb.append("yes"+"\n");
				else if(a[i] == a[n.length()-j])
					continue;
				else {
					sb.append("no"+"\n");
					break;
				}	
			}
		}
		System.out.println(sb);
	}
}