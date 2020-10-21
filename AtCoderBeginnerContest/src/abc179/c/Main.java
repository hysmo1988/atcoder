package abc179.c;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long ret = 0L;
		for (long a = 1; a < n; a++) {
			ret += (n - 1) / a;
		}
		prtln(ret);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
