package solved_ac.class2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class No10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			String a = br.readLine();
			
			// push X
			if(a.contains("push")) {
				num = Integer.parseInt(a.substring(5, a.length()));
				arr.add(num);
			}
			
			// pop
			else if(a.equals("pop")) {
				if(arr.size() > 0) {
					bw.write(arr.get(arr.size() - 1) + "\n");
					arr.remove(arr.size() - 1);
				}
				else
					bw.write(-1 + "\n");
			}
			
			// size
			else if(a.equals("size"))
				bw.write(arr.size() + "\n");
			
			// empty
			else if(a.equals("empty")) {
				if(arr.isEmpty())
					bw.write(1 + "\n");
				else
					bw.write(0 + "\n");	
			}
			
			// top
			else if (a.equals("top")) {
				if(arr.isEmpty())
					bw.write(-1 + "\n");
				else
					bw.write(arr.get(arr.size() - 1) + "\n");
			}	
		}
		
		bw.flush();
		bw.close();
		
	}

}