package arc107.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        long mod = 998244353L;
        long ans = 0L;
        long aa = (a * (a + 1)) / 2 % mod; 
        long bb = (b * (b + 1)) / 2 % mod; 
        long cc = (c * (c + 1)) / 2 % mod; 
        ans = aa % mod * bb % mod * cc % mod;
        prtln(ans % mod);
	}
	public static <T> void prt(T t) { System.out.print(t); }
	public static <T> void prtln(T t) { System.out.println(t); }

}
