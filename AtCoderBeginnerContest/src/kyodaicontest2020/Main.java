package kyodaicontest2020;

import java.util.Random;

public class Main {

	public static void main(final String[] args) {
		int n = 5;
		char c[][] = new char[n][n];

		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int r = random.nextInt(26);
				c[i][j] = intToLower(r);
			}
		}

		prtln(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				prt(c[i][j]);
			}
			prtln("");
		}
	}

	public static char intToLower(int a) { return (char)(a + 'a'); }

	public static <T> void prtln(T t) { System.out.println(t); }
	public static <T> void prt(T t) { System.out.print(t); }
}
