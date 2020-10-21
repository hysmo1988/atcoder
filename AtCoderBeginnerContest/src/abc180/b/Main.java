package abc180.b;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		long ans1 = 0L;
		long ans2 = 0L;
		long ans3 = 0L;
		for (int i = 0; i < x.length; i++) {
			// マンハッタン
			ans1 += Math.abs(x[i]);
			// ユークリッド
			ans2 += Math.pow(x[i], 2);
			// チェビシェフ
			ans3 = Math.max(ans3, Math.abs(x[i]));
		}
		prtln(ans1);
		prtln(Math.pow(ans2, 0.5));
		prtln(ans3);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}