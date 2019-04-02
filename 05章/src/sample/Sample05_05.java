package sample;
public class Sample05_05 {
	public static void main(String[] args) {
		// 文字列の長さ（リテラルの場合）
		int len = "abdこんにちは".length();
		System.out.println(len);
		
		// 文字列の長さ（変数の場合）
		String str = "ABC漢字";
		len = str.length();
		System.out.println(len);
	}
}
