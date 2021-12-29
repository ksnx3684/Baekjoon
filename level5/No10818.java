package com.ksnx3684.s4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int max = -1000001;
		int min = 1000001;
		int N = Integer.parseInt(sc.readLine());
		StringTokenizer st = new StringTokenizer(sc.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a > max)
				max = a;
			if(a < min)
				min = a;
		}
		System.out.println(min + " " + max);
	}
}
