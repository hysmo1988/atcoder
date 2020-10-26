package abc116.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int ca = sc.nextInt();
        sc.close();
        prtln((bc * ab) / 2);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}