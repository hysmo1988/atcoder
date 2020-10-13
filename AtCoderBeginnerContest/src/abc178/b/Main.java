package abc178.b;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		sc.close();
		// a <= x <= b and c <= y <= d
		long ans1 = a * c;
		long ans2 = a * d;
		long ans3 = b * c;
		long ans4 = b * d;
		prtln(Math.max(ans1, Math.max(ans2, Math.max(ans3, ans4))));
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
