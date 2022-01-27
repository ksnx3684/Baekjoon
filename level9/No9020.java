package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No9020 {
	// 해당 코드는 속도면에서도 느리고 메모리도 불필요하게 많이 잡아먹기 때문에 사용하지 않을 것을 권장한다.
	// for문 안에서 42번째줄의 if문부터 시작하여 44번째줄에서 Integer.toString 메서드를 과도하게 사용하고 있기 때문에 메모리 낭비가 심해지고 있다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(goldbach(n)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static String goldbach(int n) {
		boolean[] a = new boolean[n+1];
		a[0] = true; a[1] = true;
		int max = 0;
		int max2 = 1;
		int[] d = new int[2];
		String r = null;
		d[0] = 10000;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(a[i] == true)
				continue;
			for(int j = i + i; j <= n; j += i)
				a[j] = true; // 소수면 false, 소수가 아니면 true
		}
		for(int i = 2; i <= n/2; i++) {
			if(a[i] == false) { // 소수라면
				max = i;
				if(a[n-max] == false) {
					max2 = n - max;
					d[1] = max2 - max;
				} else
					continue;
			}
			if(d[0] > d[1] && max2 - max >= 0) {
				d[0] = d[1];
				r = Integer.toString(max)+" "+Integer.toString(max2);
			}
		}
		return r;
	}
}