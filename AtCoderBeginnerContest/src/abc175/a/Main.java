package abc175.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		boolean R1 = s[0] == 'R' ? true : false;
		boolean R2 = s[1] == 'R' ? true : false;
		boolean R3 = s[2] == 'R' ? true : false;
		if (R1 && R2 && R3) prtln(3);
		else if (R2 && (R1 || R3)) prtln(2);
		else if (R1 || R2 || R3) prtln(1);
		else prtln(0);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
