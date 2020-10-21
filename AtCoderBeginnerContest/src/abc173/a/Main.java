package abc173.a;

import java.util.Scanner;

public class Main {

	final static int senen = 1000;

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ret = n / senen;
		if (n % senen > 0) ret++;
 		prtln((senen * ret) - n);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
