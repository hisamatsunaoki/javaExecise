package sample;

public class Sample07_04 {
	public static void main(String[] args) {
		double[] val = { 1.25, 0.85, 3.2, 4.11, 0.56, 7.6 };
		double total = 0;
		for (int i = 0; i < val.length; i++) {// 1つ目のfor文。カウンタ変数はi
			total += val[i];					// 合計を取る
		}
		System.out.println("合計=" + total);
		for (int i = 0; i < val.length; i++) {	// ２つ目のfor文。カウンタ変数はi
			System.out.print(val[i] + "\t");	// 配列要素を表示する
		}
	}
}
