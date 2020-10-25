package abc117.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = (double)sc.nextInt();
        double x = (double)sc.nextInt();
        sc.close();
        prtln(t / x);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}