package sample;
import lib.Input;
public class Sample05_03 {
	public static void main(String[] args) {
		double x = Input.getDouble(); 	// 1辺の長さを入力して、xに受け取る
		double s = Math.pow(x, 2); 		// xを2乗して面積を計算する
		System.out.println("正方形の面積=" + s);
	}
}
