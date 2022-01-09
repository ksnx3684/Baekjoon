package level6;
import java.util.ArrayList;
public class No4673_1 {
	public static void main(String[] args) {
		ArrayList<Integer>c = new ArrayList<Integer>();
		for(int i = 1; i <= 10000; i++) {
			int j = 1;
			boolean flag = false;
			while(i >= j) {
				if(!flag) {
					for(; j <= 10000;) {
						if(i == j + (j/10000) + (j%10000/1000) + (j%10000%1000/100) + (j%10000%1000%100/10) + (j%10000%1000%100%10)) {
							flag = true;
							break;
						} else {
							j++;
							if(i < j)
								c.add(i);						
							break;
						}
					}
				} else
					break;
			}
		}
		for(int i = 0; i < c.size(); i++)
			System.out.println(c.get(i));
	}
}