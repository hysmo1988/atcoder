package arc106.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int maxb = (int)(Math.log(n) / Math.log(5.0));
        for (int i = maxb; i > 0; i--) {
            long b = 1L;
            for (int bb = 1; bb <= i; bb++) {
                b *= 5;
            }
            // long b = (long)Math.pow(5, i);
            // if (i == 1) {
            //     prtln(n - b);
            //     prtln(Math.log(n - b));
            //     prtln(Math.log(3.0));
            //     prtln((40.64865468072006 / 1.0986122886681098) + 0.5);
            // }
            int maxa = (int)((Math.log(n - b) / Math.log(3.0)) + 0.5);
            for (int j = maxa; j > 0; j--) {
                // long a = (long)Math.pow(3, j);
                long a = 1L;
                for (int aa = 1; aa <= j; aa++) {
                    a *= 3;
                }
                if(a + b == n) {
                    prtln(j + " " + i);
                    return;
                }
            }
        }
        prtln(-1);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
