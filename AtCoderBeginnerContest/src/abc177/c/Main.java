package abc177.c;

import java.util.Scanner;

public class Main {
    
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        sc.close();
        long mod = (long)Math.pow(10, 9) + 7;
        long ans = 0L;
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            ans = (ans + (a[i] * sum)) % mod;
            sum = (sum + a[i]) % mod;
        }
        // ans %= mod;
        // ans = (ans + mod) % mod;
        prtln(ans);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
