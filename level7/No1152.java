package level7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String n = sc.readLine();
		String t = n.trim();
		String[] r = t.split(" ");
		if(r[0].isEmpty()) // 아무것도 입력 안하고 스페이스 공백만 입력했을 경우 결과값이 1이 나오므로 예외 처리를 해준다.
			System.out.println(r.length-1);
		else
			System.out.println(r.length);
	}
}