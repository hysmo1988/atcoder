package abc165.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if((b / k) * k >= a) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
