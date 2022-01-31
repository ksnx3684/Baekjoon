package level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No2798_1 {
	// 어레이 요소들을 정렬하는 코드와 후반의 자잘한 조건식을 없애고 ArrayList에 넣은 카드 요소들을 배열에 넣는 것으로 바꾸었다
	// 동일한 알고리즘이라고 해도 ArrayList에 비해 배열이 메모리를 덜 잡아먹으며 성능도 더 빠른 특징이 있다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sum = 0; int b = 0; int[] a = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < a.length-2; i++) {
			for(int j = i+1; j < a.length-1; j++) {
				for(int k = j+1; k < a.length; k++) {
					sum = a[i] + a[j] + a[k];
					if(sum <= m && m - sum < m - b)
						b = sum;
				}
			}
		}
		System.out.println(b);
	}
}