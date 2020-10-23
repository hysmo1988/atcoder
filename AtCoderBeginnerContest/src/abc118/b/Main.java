package abc118.b;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] like = new int[m];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                like[a - 1]++;
            }
        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (like[i] == n) ans++;
        }
        prtln(ans);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
    
}
