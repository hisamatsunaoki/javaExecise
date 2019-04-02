package sample;

import lib.Input;

public class Sample09_02 {
	public static void main(String[] args) {
		int n;
		while ((n=Input.getInt()) != 0) { 			// nが0でなければ繰り返す
			System.out.println(n + " を入力"); 		// 入力した値を表示
		}
	}
}
