package exercise;

import lib.Input;

public class Pass12_02 {

	public static void main(String[] args) {
		// ここにコードを挿入
		String input = Input.getStr("テストする文字列");
		String outputText;
		if(isEmpty(input)) {
			outputText = "nullまたは空";
		} else {
			outputText = "nullでも空でもない";
		}
		System.out.println(outputText);
	}

	public static boolean isEmpty(String text) {
		boolean result;
		if(text == null || text.isEmpty() || text.compareTo("") == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
