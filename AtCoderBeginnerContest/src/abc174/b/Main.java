package abc174.b;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			double p = Math.pow((double)x[i], 2);
			double q = Math.pow((double)y[i], 2);
			double r = Math.sqrt(p + q);
			// prtln("r="+r);
			if(r <= d) ans++;
		}
		prtln(ans);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}