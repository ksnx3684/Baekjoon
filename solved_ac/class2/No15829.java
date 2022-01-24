package solved_ac.class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No15829 {
	// 이 문제는 모듈러연산의 성질을 이용한 문제이다
	// 31의 거듭제곱을 하다보면 출력범위가 넘어가버려 오버플로우가 발생할 수 있는데 이 때 M(1234567891)으로 나누어 이를 방지한다
	// 분배법칙이 적용되는 모듈러연산의 특징을 이용해 오버플로우 방지를 위한 분배법칙을 적용해준다
	// 거듭제곱 구현 시 Math.pow를 사용하면 오버플로우가 발생하므로 이 문제에선 사용하면 안된다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		long sum = 0;
		long pow = 1;
		long[] a = new long[l];
		String s = br.readLine();
		for(int i = 0; i < l; i++) {
			a[i] = s.charAt(i) - 96; // 소문자를 숫자로 변환
			sum += (a[i] * pow)%1234567891; // 입력한 소문자에 맞는 수에 31의 0승부터 곱하여 sum에 누적시킨다.(분배법칙 적용)
			
			pow = (pow*31)%1234567891; // 이 식을 통해 거듭제곱이 0승 부터 l승까지 증가한다.(분배법칙 적용)
		}
		System.out.println((sum%1234567891));
	}
}