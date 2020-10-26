package abc115.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(p);
        int ans = 0;
        for (int i = 0; i < p.length - 1; i++) {
            ans += p[i];
        }
        ans += p[n - 1] / 2;
        prtln(ans);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}