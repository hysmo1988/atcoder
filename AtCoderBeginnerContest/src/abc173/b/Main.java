package abc173.b;

import java.util.Scanner;

public class Main {

	final static String AC = "AC";
	final static String WA = "WA";
	final static String TLE = "TLE";
	final static String RE = "RE";

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			switch (s) {
				case AC: ac++; break;
				case WA: wa++; break;
				case TLE: tle++; break;
				case RE: re++; break;
				default: break;
			}
		}
		sc.close();
		prtln(AC + " x " + ac);
		prtln(WA + " x " + wa);
		prtln(TLE + " x " + tle);
		prtln(RE + " x " + re);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
