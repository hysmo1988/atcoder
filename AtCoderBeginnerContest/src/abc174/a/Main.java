package abc174.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
 		prtln(x >= 30 ? "Yes" : "No");
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
