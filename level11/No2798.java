package level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No2798 {
	// 주어진 카드는 중복이 불가하며 최대한 M에 가까운 합을 찾아야 한다
	// 입력 받은 카드의 수를 오름차순으로 정렬 후 for문에서 하나씩 합을 계산하고 int r에 값을 갱신하면서 가장 가까운 합을 찾아낸다
	// 합이 M과 같으면 그 즉시 모든 반복문을 종료후 그 값을 출력하고, 합이 M보다 크면 현재 반복문을 탈출하여 다음 카드에서부터 찾는다
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> a = new ArrayList<>();
		int sum = 0; int r = 0;
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++)
			a.add(Integer.parseInt(st.nextToken()));
		Collections.sort(a); // 정렬
		loopout:
		for(int i = 0; i < a.size()-2; i++) {
			for(int j = i+1; j < a.size()-1; j++) {
				for(int k = j+1; k < a.size(); k++) {
					sum = a.get(i) + a.get(j) + a.get(k);
					if(sum == m) { // sum과 m이 같다면 반복문 완전 종료 후 출력
						r = sum;
						break loopout;
					}
					else if(sum > m) // sum이 m보다 크다면 탈출
						break;
					else if(sum <= m && m - sum < m - r) // sum이 m보다 작으면서 m - sum이 m - r보다 작으면
						r = sum; // r의 값 갱신
				}
			}
		}
		System.out.println(r);
	}
}