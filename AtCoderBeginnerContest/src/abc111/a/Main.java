package abc111.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        sc.close();
        for (int i = 0; i < n.length; i++) {
            prt(n[i] == '1' ? '9' : '1');
        }
        prtln("");
	}
	public static <T> void prt(T t) { System.out.print(t); }
	public static <T> void prtln(T t) { System.out.println(t); }
}