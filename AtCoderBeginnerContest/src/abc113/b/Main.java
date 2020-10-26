package abc113.b;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < h.length; i++) {
            int ave = (t * 1000) - (h[i] * 6);
            int abs = Math.abs(a * 1000 - ave);
            if (min > abs) {
                min = abs;
                ans = i + 1;
            }  
        }
        prtln(ans);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}