package abc128.a;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		sc.close();
		System.out.println(((A * 3) + P) / 2);
	}
}