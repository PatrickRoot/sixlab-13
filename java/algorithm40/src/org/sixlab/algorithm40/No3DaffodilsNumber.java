package org.sixlab.algorithm40;

/**
 * 
 * @author loki
 * 
 *         题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个
 *         "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class No3DaffodilsNumber {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (isDaffodilsNumber(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isDaffodilsNumber(int num) {
		String numString = String.valueOf(num);
		int plus = 0;
		for (int i = 0; i < numString.length(); i++) {
			int a = (int) (num / (Math.pow(10, i)));
			a %= 10;
			plus += (int) Math.pow(a, 3);
		}
		if (num == plus) {
			return true;
		} else {
			return false;
		}
	}
}