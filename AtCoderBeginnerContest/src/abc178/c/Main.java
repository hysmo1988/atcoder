package abc178.c;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long mod = (long)Math.pow(10, 9) + 7;
		long a = 1L;
		long b = 1L;
		long c = 1L;
		for (int i = 0; i < n; i++) {
			a *= 10L;
			a %= mod;
			b *= 9L;
			b %= mod;
			c *= 8L;
			c %= mod;
		}
		long ans = a - b - b + c;
		ans %= mod;
		ans = (ans + mod) % mod;
		prtln(ans); 
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
