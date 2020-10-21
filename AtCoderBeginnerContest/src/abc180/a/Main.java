package abc180.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		prtln(n - a + b);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
