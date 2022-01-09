package level6;
public class No4673 {
	public static void main(String[] args) {
		boolean[] c = new boolean[10001];
		for(int i = 1; i <= 10000; i++) {
			int b = a(i);
			if(b <= 10000)
				c[b] = true; // 생성자가 있는 수의 인덱스에 true값을 넣는다.(boolean 배열 생성 시 최초 값은 일괄 false값이 들어간다.)
		}
		for(int i = 1; i <= 10000; i++) {
			if(c[i] == false) // 해당 인덱스가 false 값이라면
				System.out.println(i); // 해당 인덱스 출력
		}
	}
	public static int a(int number) { // 생성자가 있는 숫자를 찾는 함수
		int sum = number;
			while(number != 0) {
				sum = sum+number%10;
				number = number/10;
			}
		return sum;
	}
}