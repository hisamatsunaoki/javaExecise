package sample;

import lib.Input;

public class Sample11_08 {
	public static void main(String[] args) {
		exit: for (int i = 0; i < 2; i++) {
			int data, total = 0;
			while ((data = Input.getInt("データ")) != 0) {
				if (data < 0) {
					System.out.println("不正なデータ:" + data);
					break exit; // 繰り返し処理を中止する
				}
				total += data; // 合計する
			}
			System.out.println("合計=" + total); // 合計を表示する
		}
		System.out.println("END");
	}
}
