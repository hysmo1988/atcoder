package abc106.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        prtln((a - 1) * (b - 1));
	}
	public static <T> void prt(T t) { System.out.print(t); }
	public static <T> void prtln(T t) { System.out.println(t); }

}
