package abc176.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double f = k * (Math.pow((double)k, (double)n) - 1) + 1;
		int[] v = new int[(int)f];
		sc.close();
		prtln(v.toString());
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
