package hitachiprocon2020.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		System.out.println(S.matches("(hi)+") ? "Yes" : "No");
	}
}
