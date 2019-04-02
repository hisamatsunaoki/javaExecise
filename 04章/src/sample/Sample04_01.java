package sample;
public class Sample04_01 {
	public static void main(String[] args) {
		int	x, y;
		// 前置
		x = 10;
		y = ++x + 5;		// xを1増やした直後に x+5 を実行する
		System.out.println(x);
		System.out.println(y);
		// 後置
		x = 10;
		y = x++ + 5;		// x+5 を実行した直後にxを1増やす	
		System.out.println(x);
		System.out.println(y);
	}
}
