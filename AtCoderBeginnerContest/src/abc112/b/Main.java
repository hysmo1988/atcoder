package abc112.b;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] c = new int[N];
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        sc.close();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (t[i] <= T) {
                min = Math.min(min, c[i]);
            }
        }
        prtln(min == Integer.MAX_VALUE ? "TLE" : min);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}