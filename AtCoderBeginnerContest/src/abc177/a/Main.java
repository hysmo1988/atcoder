package abc177.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
 		prtln(d <= s * t ? "Yes" : "No");
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
