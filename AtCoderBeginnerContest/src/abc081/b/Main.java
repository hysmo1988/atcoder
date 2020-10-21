package abc081.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値Nの取得
		int n = sc.nextInt();
		// 整数N個の配列を定義
		List<Integer> an = new ArrayList<>();
		// 整数Nの入力値を取得
		for(int i=0;i<n;i++) {
			an.add(sc.nextInt());
		}
		sc.close();
		// 整数Nの値が全て偶数か判断
		int res = 0;
		boolean even = false;
		do {
			even = chkAllEven(an);
			if(even) {
				an = divide(an);
				res++;
			}else {
				even = false;
			}
		} while (even);
		System.out.println(res);
	}

	private static boolean chkAllEven(List<Integer> datas) {
		// 2で割れない値があればfalseを返す
		// すべて2で割れる値の場合はtrueを返す
		return datas.stream()
				.filter(data -> (data%2)!=0)
				.collect(Collectors.toList())
				.size() > 0 ? false : true;
	}

	private static List<Integer> divide(List<Integer> datas){
		// 全ての値を2で割る
		List<Integer> r = new ArrayList<>();
		datas.stream().forEach(data -> {
			r.add(data/2);
		});
		return r;
	}
}
