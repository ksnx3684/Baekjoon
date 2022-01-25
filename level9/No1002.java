package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1002 {
	// 각 좌표를 원의 중심점으로, 거리를 원의 반지름으로 생각하여 푸는 문제다.
	// 두 원의 중심점의 거리와 두 원의 접점과의 관계를 이용한다.
	// 원은 내접, 외접할 경우 접점이 1개, 서로 밖에 있거나 다른 원이 내부에 있으면서 만나지 않는 경우에는 0개, 그 이외는 모두 서로 다른 두 점에서 만난다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int sum = result(x1, y1, r1, x2, y2, r2);
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int result(int x1, int y1, int r1, int x2, int y2, int r2) {
		// 두 점 사이의 거리 공식 : sqrt((x2-x1)^2 + (y2-y1)^2)
		// Math.sqrt() 함수를 사용할 경우, 근삿값이 발생하여 오류가 발생 할 수 있으므로 여기에서는 사용하지 않는다.
		// 대신, 루트 없이 제곱근의 값을 직접 비교하여 코드를 작성한다.
		int distance_pow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // 두 점 사이의 거리의 제곱근
		
		// 두 원은 서로 밖에 있으며, 만나지 않는다
		if(distance_pow > Math.pow(r2 + r1, 2))
			return 0;
		// 두 원이 외접한다
		if(distance_pow == Math.pow(r2 + r1, 2))
			return 1;
		// 두 원이 중심이 같고 거리도 같다 (접점이 무한)
		if(x1 == x2 && y1 == y2 && r1 == r2)
			return -1;
		// 두 원이 내접한다
		if(distance_pow == Math.pow(r2 - r1, 2))
			return 1;
		// 다른 원의 내부에 있으며 서로 만나지 않는다
		if(distance_pow < Math.pow(r2 - r1, 2))
			return 0;
		// 두 원이 서로 다른 두 점에서 만난다
		else
			return 2;	
	}
}