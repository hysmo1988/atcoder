package abc111.b;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = n / 111;
        if (n % 111 != 0) {
            ans += 1;
        }
        prtln(ans * 111);
    }
    public static <T> void prtln(T t) { System.out.println(t); }
}