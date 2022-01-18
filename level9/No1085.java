package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());		
		int min1 = Math.min(x, w - x);
		int min2 = Math.min(y, h - y);		
		System.out.println(Math.min(min1, min2));
	}
}
		
//		if (x == 1 || y == 1)
//			System.out.println(1);
//		else if(x > w - x || y > h - y) { 
//			if(w - x > h - y)
//				System.out.println(h - y);
//			else
//				System.out.println(w - x);
//			
//		} else if (x < w - x || y < h - y) {
//			if(x > y)
//				System.out.println(y);
//			else
//				System.out.println(x);
//			
//		} else if (x == w - x || y == h - y) {
//			if(x > y)
//				System.out.println(y);
//			else
//				System.out.println(x);
//		}