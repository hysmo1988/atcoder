package abc135.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		int r = 0;
		for(int i = 0; i < N; i++) {
			if(p[i] != i + 1) r++;
		}
		System.out.println(r <= 2 ? "YES" : "NO");
	}
}
