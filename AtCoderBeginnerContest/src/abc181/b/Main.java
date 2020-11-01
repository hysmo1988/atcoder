package abc181.b;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            // 初項 = a
            // 公差 = 1
            // 項数 = b - (a + 1)
            long nn = (b - a + 1) * (a + b);
            //prtln(nn);
            long wa = nn / 2;

            //prtln(wa);
            ans += wa;
        }
        sc.close();
        prtln(ans);
	}
	public static <T> void prt(T t) { System.out.print(t); }
	public static <T> void prtln(T t) { System.out.println(t); }

}
