package abc118.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        boolean ret = false;
        for (int i = 1; i <= b; i++) {
            if (i == a && b % i == 0) ret = true;
        }
        prtln(ret ? a + b : b - a);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}