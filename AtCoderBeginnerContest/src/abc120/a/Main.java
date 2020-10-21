package abc120.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int answer = C;
		// ?????
		int cnt = B / A;
		if(cnt < C) {
			answer = cnt;
		}
		// ??
		prtln(answer);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}