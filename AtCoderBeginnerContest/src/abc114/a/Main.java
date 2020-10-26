package abc114.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        prtln(x == 7 || x == 5 || x == 3 ? "YES" : "NO");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}