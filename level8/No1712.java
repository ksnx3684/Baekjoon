package level8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] s = new int[3]; // s[0]은 고정비용, s[1]은 가변비용, s[2]은 판매가격
		for(int i = 0; i < 3; i++)
			s[i] = Integer.parseInt(st.nextToken());
		if(s[1] >= s[2]) // 가변비용이 판매가격보다 크거나 같으면
			System.out.println(-1); // 손익분기점이 없음
		else {
			int count = s[0]/(s[2]-s[1])+1; // 손익분기점은 고정비용을 판매가격-가변비용 즉, 순이익으로 나눈 값에 +1을 한 값
			System.out.println(count); // 손익분기점 = 고정비용/순이익 + 1
		}
	}
}