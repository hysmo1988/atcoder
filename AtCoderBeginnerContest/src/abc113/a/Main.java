package abc113.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        prtln(x + (y /2));
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}