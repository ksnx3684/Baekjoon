package solved_ac.class2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class No10866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String a = br.readLine();
			
			// push_front X
			if(a.contains("push_front")) {
				num = Integer.parseInt(a.substring(11, a.length()));
				arr.add(0, num);
			}
			
			// push_back X
			else if(a.contains("push_back")) {
				num = Integer.parseInt(a.substring(10, a.length()));
				arr.add(arr.size(), num);
			}
			
			// pop_front
			else if(a.equals("pop_front")) {
				if(arr.size() > 0) {
					bw.write(arr.get(0) + "\n");
					arr.remove(0);
				} else
					bw.write(-1 + "\n");	
			}
			
			// pop_back
			else if(a.equals("pop_back")) {
				if(arr.size() > 0) {
					bw.write(arr.get(arr.size() - 1) + "\n");
					arr.remove(arr.size() - 1);
				} else
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
			
			// front
			else if(a.equals("front")) {
				if(arr.size() > 0)
					bw.write(arr.get(0) + "\n");
				else
					bw.write(-1 + "\n");
			}
			
			// back
			else if(a.equals("back")) {
				if(arr.size() > 0)
					bw.write(arr.get(arr.size() - 1) + "\n");
				else
					bw.write(-1 + "\n");
			}		
		}
		
		bw.flush();
		bw.close();

	}

}