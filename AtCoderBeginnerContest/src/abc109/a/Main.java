package abc109.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        prtln((a * b) % 2 == 0 ? "No" : "Yes");
	}
	public static <T> void prt(T t) { System.out.print(t); }
	public static <T> void prtln(T t) { System.out.println(t); }
}