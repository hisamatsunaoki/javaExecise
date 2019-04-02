package sample;
public class Sample06_03_実行時例外 {
	public static void main(String[] args) {
		int[] dn = {21, 12, 45, 3, 56};
		System.out.println(dn[5]);	// 要素番号は0～4なので、5は範囲外
	}
}
