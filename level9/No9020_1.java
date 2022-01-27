package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No9020_1 {
	// 골드바흐의 파티션은 짝수를 두 소수의 합으로 나타내는 표현 방식이며, 각 테스트 케이스에 대해 두 소수의 차가 가장 작은 것을 출력한다.
	// 먼저 에라토스테네스의 체를 이용하여 10000까지의 소수를 걸러낸다.
	// 그 다음 변수 n(짝수)을 나타내는 골드바흐 파티션 중 가장 작은 차가 나올 때 까지 반복한다.
	
	public static boolean[] a = new boolean[10001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		era();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int max = 0; int max2 = 1;
			int r1 = 0; int r2 = 0;
			int[] d = new int[2]; d[0] = 10000;
			for(int j = 2; j <= n/2; j++) {
				if(a[j] == false) { // 소수라면
					max = j;
					if(a[n-max] == false) { // n에서 max를 뺀 수가 소수라면
						max2 = n - max;
						d[1] = max2 - max; // 두 수의 차를 저장
					} else
						continue;
				}
				if(d[0] > d[1] && max2 - max >= 0) { // 이전 케이스의 차가 현재 케이스의 차보다 크다면
					d[0] = d[1]; // 현재 케이스의 차를 저장
					r1 = max; r2 = max2;
				}
			}	
			sb.append(r1).append(" ").append(r2).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void era() { // 에라토스테네스의 체로 소수 구하기
		a[0] = a[1] = true;
		for(int i = 2; i < Math.sqrt(a.length); i++) {
			if(a[i] == true) // 소수가 아닌 경우
				continue;
			for(int j = i + i; j < a.length; j += i)
				a[j] = true; // 2의 배수, 3의 배수 부터 시작해서 소수가 아닌 수를 true 처리
		}
	}
}