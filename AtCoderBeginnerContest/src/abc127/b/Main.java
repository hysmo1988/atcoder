package abc127.b;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		for(int i = 1; i <= 10; i++) {
			x = (r * x) - D;
			System.out.println(x);
		}
	}
}