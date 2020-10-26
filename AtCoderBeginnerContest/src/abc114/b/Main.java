package abc114.b;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int min = 999;
        for (int i = 0; i < s.length() - 2; i++) {
            int x = Integer.parseInt(s.substring(i, i + 3));
            min = Math.min(min, Math.abs(753 - x));
        }
        prtln(min);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}