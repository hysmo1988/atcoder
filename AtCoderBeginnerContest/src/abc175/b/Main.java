package abc175.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] l = new long[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(l);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					boolean b1 = l[i] != l[j] && l[j] != l[k];
					boolean b2 = l[i] + l[j] > l[k];
					if (b1 && b2) ans++;
				}
			}
		}
		prtln(ans);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}