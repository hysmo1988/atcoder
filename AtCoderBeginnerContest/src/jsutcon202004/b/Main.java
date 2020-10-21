package jsutcon202004.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] R = new int[N];
		int[] B = new int[N];
		int r = 0, b = 0;
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			char[] C = sc.next().toCharArray();
			if(C[0] == 'R') { R[r] = X; r++; }
			else { B[b] = X; b++; }
		}
		sc.close();
		Arrays.sort(R);
		Arrays.sort(B);
		for(int i = N - r; i < N; i++) {
			System.out.println(R[i]);
		}
		for(int i = N - b; i < N; i++) {
			System.out.println(B[i]);
		}
	}
}
