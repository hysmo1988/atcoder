package abc140.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N];
		for(int i = 0; i < N - 1; i++) {
			B[i] = sc.nextInt();
		}
		B[N - 1] = Integer.MAX_VALUE;
		sc.close();
		int sum = B[0];
		// System.out.println("--------");
		// System.out.print(sum);
		for(int i = 0; i < N - 1; i++) {
			// System.out.print(">");
			sum += Math.min(B[i], B[i + 1]);
			// System.out.print(sum);
		}
		// System.out.println("\n--------");
		System.out.println(sum);
	}
}
