package abc178.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
 		prtln(s == 1 ? 0 : 1);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
