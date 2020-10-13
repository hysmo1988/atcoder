package abc177.b;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		int min = t.length;
		for (int i = 0; i < s.length - (t.length - 1); i++) {
			int idx = i;
			int cnt = 0;
			for (int j = 0; j < t.length; j++) {
				if (t[j] != s[idx++]) cnt++;
			}
			min = Math.min(min, cnt);
		}
		prtln(min);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
