package level3;
import java.util.Scanner;

public class No2739 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
        for (int N = 1; N <= 9; N++){
		    System.out.println(num + " * " + N + " = " + num*N);
	    }
        stdIn.close();
    }
}
