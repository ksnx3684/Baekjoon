package level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2231 {
	// Level6 No4673의 생성자와 비슷한 문제이다
	// 셀프넘버를 구했던 알고리즘을 이용하여 역으로 생성자를 구해낸다
	// 자연수의 N이 주어졌을 때 가장 작은 생성자를 출력해야 하므로 for문을 통해 1에서부터 검색하며 올라간다
	// i와 각 자릿수의 합이 N과 같아지면 i값을 출력한다
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean a = true;
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i < n; i++) {
			int result = i; int j = i;
			while(j != 0) {
				result = result + j%10;
				j = j/10;
			}
			if(n == result) {
				System.out.println(i);
				a = false;
				break;
			}
		}
		if(a)
			System.out.println(0);
	}
}