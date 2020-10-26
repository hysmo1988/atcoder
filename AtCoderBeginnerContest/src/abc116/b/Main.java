package abc116.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.close();

        // 同じ値が2回目に出てきたindexを答える
        boolean loop = true;
        int idx = 1;
        int n = s;
        List<Integer> a = new ArrayList<>();
        a.add(n);
        do {
            idx++;
            if (n % 2 == 0) n = even(n);
            else n = odd(n);
            if (a.contains(n)) loop = false;
            a.add(n);
        } while (loop);
        prtln(idx);
    }
    // 偶数
    private static int even(int n) {
        return n /2;
    }
    // 奇数
    private static int odd(int n) {
        return (3 * n) + 1;
    }
	public static <T> void prtln(T t) { System.out.println(t); }
}