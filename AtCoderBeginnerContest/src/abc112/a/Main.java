package abc112.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            prtln("Hello World");
        } else {
            int a = sc.nextInt();
            int b = sc.nextInt();
            prtln(a + b);
        }
        sc.close();
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}