package sample;

import lib.Input;

public class Sample11_06 {
	public static void main(String[] args) {
		int data, total = 0;
		while ((data = Input.getInt("データ")) != 0) {
			if (data < 0) { // dataは負か？
				System.out.println("不正なデータ:" + data); // dataの値を表示する
				continue; // 後の処理をスキップして先頭へ戻る
			}
			total += data; // 合計する
		}
		System.out.println("合計=" + total); // 合計を表示する
	}
}
