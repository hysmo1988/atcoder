package abc108.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int ans = (k / 2) * (k / 2);
        if (k % 2 != 0) {
            ans += (k / 2);
        }
        prtln(ans);
        // 2 -> 1
        // 1 2
        // 3 -> 2 1 * 1 + even(1)
        // 1 2
        // 2 3★
        // 4 -> 4 2 * 2
        // 1 2
        // 1 4
        // 2 3
        // 3 4
        // 5 -> 6 2 * 2 + even(2)
        // 1 2
        // 1 4
        // 2 3
        // 2 5★
        // 3 4
        // 4 5★
        // 6 -> 9 3 * 3
        // 1 2
        // 1 4
        // 1 6
        // 2 3
        // 2 5
        // 3 4
        // 3 6
        // 4 5
        // 5 6
        // 7 -> 12 3 * 3 + even(3)
        // 1 2
        // 1 4
        // 1 6
        // 2 3
        // 2 5
        // 2 7★
        // 3 4
        // 3 6
        // 4 5
        // 4 7★
        // 5 6
        // 6 7★
	}
	public static <T> void prt(T t) { System.out.print(t); }
	public static <T> void prtln(T t) { System.out.println(t); }
}