package abc126.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();
		S[K - 1] = Character.toLowerCase(S[K - 1]);
		for(int i = 0; i < N; i++) {
			System.out.print(S[i]);
		}
	}
}