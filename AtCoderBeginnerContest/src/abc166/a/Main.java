package abc166.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println("ABC".equals(s) ? "ARC" : "ABC");
	}
}