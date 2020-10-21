package abc088.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * 2019/11/28 21:23start 21:36 end
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// カードの枚数
		int n = sc.nextInt();
		List<Integer> aList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			// 取るカード
			aList.add(sc.nextInt());
		}
		sc.close();

		// 数字の大きい順に並び替え
		aList.sort(Collections.reverseOrder());
		// Alice → Bob の順にカードを取る
		int alice = 0;
		int bob = 0;
		for(int i=1;i<=aList.size();i++) {
			if(i%2==1) {
				alice+=aList.get(i-1);
			}else {
				bob+=aList.get(i-1);
			}
		}
		// 得点差
//		System.out.println(alice + ":" + bob);
		System.out.println(alice-bob);
	}
}
