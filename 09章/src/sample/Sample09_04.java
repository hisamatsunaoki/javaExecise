package sample;

import lib.Input;
public class Sample09_04 {
	public static void main(String[] args) {
		int	value, total=0, kensu=0;		// totalとkensuに0を入れておく
		while((value=Input.getInt())!=0){
			total += value;		// totalにvalueを加算する
			kensu ++; 			// 件数を1増やす
		}
		System.out.println("合計=" + total);
		System.out.println("件数=" + kensu);  // 件数を表示する
	}
}

