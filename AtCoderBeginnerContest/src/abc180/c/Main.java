package abc180.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		ArrayList<Long> ans = process(n);
		for (int i = 0; i < ans.size(); i++) {
			prtln(ans.get(i));
		}
	}
	private static ArrayList<Long> process(long n) {
		ArrayList<Long> res = new ArrayList<>();
		for (long i = 1; i * i <= n; ++i) {
			if (n % i == 0) {
				res.add(i);
				if (n / i  != i) {
					res.add(n / i);
				}
			}
		}
		Collections.sort(res);
		return res;
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
