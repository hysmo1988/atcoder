package abc117.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += l[i];
        }
        prtln(l[n - 1] < ans ? "Yes" : "No");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}