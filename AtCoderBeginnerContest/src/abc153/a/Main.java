package abc153.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double a = sc.nextDouble();
		sc.close();
		double r = h/a;
		System.out.println((int)Math.ceil(r));
	}
}
